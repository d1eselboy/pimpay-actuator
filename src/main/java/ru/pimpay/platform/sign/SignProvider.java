package ru.pimpay.platform.sign;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.openssl.PEMDecryptorProvider;
import org.bouncycastle.openssl.PEMEncryptedKeyPair;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder;
import org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileReader;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/**
 * Created by ermolaev on 29/04/17.
 */
@Getter
@Setter
public class SignProvider {

    @Value("${pimpay.private.key.file.name}")
    private String privateKeyFileName;
    @Value("${pimpay.private.key.pass}")
    private String privateKeyPass;
    @Value("${pimpay.private.key.crypto}")
    private String crypto;
    @Value("${pimpay.private.key.signature.type}")
    private String signatureType;

    private Signature instance;

    public void init() {
        java.security.Security.addProvider(
            new org.bouncycastle.jce.provider.BouncyCastleProvider()
        );

        try {
            File privateKeyFile = new File(SignProvider.class.getClassLoader().getResource(privateKeyFileName).getFile());

            PEMParser pemParser = new PEMParser(new FileReader(privateKeyFile));
            Object object = pemParser.readObject();
            JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
            KeyFactory rsaFactory = KeyFactory.getInstance(crypto, "BC");
            KeyPair kp;
            RSAPrivateCrtKey privateKeyCRTDev;
            if (object instanceof PEMEncryptedKeyPair) {
                // Encrypted key pair - we will use provided password
                PEMEncryptedKeyPair ckp = (PEMEncryptedKeyPair) object;
                PEMDecryptorProvider decProv = new JcePEMDecryptorProviderBuilder().build(privateKeyPass.toCharArray());
                kp = converter.getKeyPair(ckp.decryptKeyPair(decProv));
                RSAPrivateCrtKeySpec privateCrtKeySpec = rsaFactory.getKeySpec(kp.getPrivate(), RSAPrivateCrtKeySpec.class);
                privateKeyCRTDev = (RSAPrivateCrtKey) rsaFactory.generatePrivate(privateCrtKeySpec);

            } else if (object instanceof PKCS8EncryptedPrivateKeyInfo) {
                // Encrypted PKCS8 key - we will use provided password
                PKCS8EncryptedPrivateKeyInfo pkp = (PKCS8EncryptedPrivateKeyInfo) object;
                InputDecryptorProvider decProv = new JceOpenSSLPKCS8DecryptorProviderBuilder().build(privateKeyPass.toCharArray());
                privateKeyCRTDev = (RSAPrivateCrtKey) converter.getPrivateKey(pkp.decryptPrivateKeyInfo(decProv));

            } else {
                // Unencrypted key - no password needed
                PEMKeyPair ukp = (PEMKeyPair) object;
                kp = converter.getKeyPair(ukp);
                RSAPrivateCrtKeySpec privateCrtKeySpec = rsaFactory.getKeySpec(kp.getPrivate(), RSAPrivateCrtKeySpec.class);
                privateKeyCRTDev = (RSAPrivateCrtKey) rsaFactory.generatePrivate(privateCrtKeySpec);
            }

            // RSA
            instance = Signature.getInstance(signatureType, "BC");
            instance.initSign(privateKeyCRTDev);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public String signData(String data) {

        instance.update((data).getBytes());
        byte[] signature = instance.sign();

        return new String(Base64.encodeBase64(signature));
    }
}