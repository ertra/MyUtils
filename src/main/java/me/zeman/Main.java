package me.zeman;

import me.zeman.utils.CryptoUtils;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {

        String passwd = "testPassword12345";
        String hashedPassword = CryptoUtils.generatePasswordHash(passwd);

        System.out.println("Password is: " + passwd);
        System.out.println("Hashed password: " + hashedPassword);

        System.out.println("Validate password " + passwd + " result: " + CryptoUtils.validatePassword(passwd, hashedPassword));
        System.out.println("Validate password aaaaaa23324 result: " + CryptoUtils.validatePassword("aaaaaa23324", hashedPassword));
        System.out.println("Validate password testPassword123451 result: " + CryptoUtils.validatePassword("testPassword123451", hashedPassword));

    }
}
