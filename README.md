pimpay-actuator

1. Сгенерируйте открытый и закрытый ключи с помощью утилиты openSSL
openssl req -x509 -newkey rsa:4096 -keyout key.pem -out cert.pem -days 365
2. 