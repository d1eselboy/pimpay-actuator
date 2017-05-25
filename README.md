## pimpay-actuator

#### Для теста работы функциональности выполните пункты 1,2,4,5 и выполните команду
```
./gradlew clean test
```

#### Для реализации своего сервиса
1. Сгенерируйте открытый и закрытый ключи с помощью утилиты openSSL, напримемер:
```
openssl req -x509 -newkey rsa:4096 -keyout key.pem -out cert.pem -days 365
```
2. Добавьте открытый ключ в профайл на pimpay
3. Сделайте fork этого проекта 
4. Положите сгенерированные ключи в resources
5. Введите параметры проекта в application.properties
6. Реализуйте нужный вам API для взаимодействия 


##### Если в момент теста вы получаете ошибку вида:
```
org.bouncycastle.pkcs.PKCSException: unable to read encrypted data: 1.2.840.113549.1.5.13 not available: Illegal key size
```
То установите Unlimited Strength [Jurisdiction Policy Files (Ссылка на Java 8)](http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html)
