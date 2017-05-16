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
import org.bouncycastle.openssl.jcajce.JcePEMDecryptorProviderBuilder;

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

    private String privateKeyFilePath;
    private String publicKeyFilePath;
    private String url;

    private static Signature instance;

    static {
        java.security.Security.addProvider(
            new org.bouncycastle.jce.provider.BouncyCastleProvider()
        );

        try {
            File privateKeyFile = new File(SignProvider.class.getClassLoader().getResource("key.pem").getFile());

            // Using bcpkix-jdk14-1.48
            PEMParser pemParser = new PEMParser(new FileReader(privateKeyFile));
            Object object = pemParser.readObject();
            JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
            KeyPair kp;
            if (object instanceof PEMEncryptedKeyPair) {
                // Encrypted key - we will use provided password
                PEMEncryptedKeyPair ckp = (PEMEncryptedKeyPair) object;
                PEMDecryptorProvider decProv = new JcePEMDecryptorProviderBuilder().build("12345".toCharArray());
                kp = converter.getKeyPair(ckp.decryptKeyPair(decProv));
            } else {
                // Unencrypted key - no password needed
                PEMKeyPair ukp = (PEMKeyPair) object;
                kp = converter.getKeyPair(ukp);
            }

            // RSA
            KeyFactory rsaFactory = KeyFactory.getInstance("RSA", "BC");
            RSAPrivateCrtKeySpec privateCrtKeySpec = rsaFactory.getKeySpec(kp.getPrivate(), RSAPrivateCrtKeySpec.class);
            RSAPrivateCrtKey privateKeyCRTDev = (RSAPrivateCrtKey) rsaFactory.generatePrivate(privateCrtKeySpec);

            instance = Signature.getInstance("SHA512withRSA", "BC");
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