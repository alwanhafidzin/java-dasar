package test;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PSource;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class TestPassword {

    public static void main(String[] args) throws Exception {
//        byte[] passwordEnkrip = encryptForPassword("Johndev1");
        String plainText = "salwa123";
        System.out.println("plaintext : " + plainText);
        byte[] passwordEnkrip = encryptForDeviceId(plainText);
        String hasilEnkripsi = Base64.getEncoder().encodeToString(passwordEnkrip);
        System.out.println("hasil enkripsi : " + hasilEnkripsi);

//        String hasilEnkripsi = "VlOjXqgJTU8esMQTXtgWa7Y7iLP+0ZT9O+Bd0z+UxiMoEPAGku/unphGW9d3LQLuUW2duzKVQRFC9hs1QLopI/h8A0m4uUTcNF0xVFvxjIDeWdRXG6XKQb8H0VZDroIMmSYdmJmCUANYnO1DedH9yFDI4PI+hJewkBqthYk1GGE=";
//
//        System.out.println("hasil enkripsi : " + hasilEnkripsi);
//        byte[] password = Base64.getDecoder().decode(hasilEnkripsi);
//        String decrypt = decryptForPassword(password);
//
//        System.out.println("hasil decrypt : " + decrypt);
    }

    public static String generateStrongPasswordHash(String password) throws NoSuchAlgorithmException, InvalidKeySpecException {
        int iterations = 1000;
        char[] chars = password.toCharArray();
        byte[] salt = getSalt();

        PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = secretKeyFactory.generateSecret(spec).getEncoded();

        return iterations + ":" + toHex(salt) + ":" + toHex(hash);
    }

    private static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);

        return salt;
    }

    private static String toHex(byte[] array) {
        BigInteger bigInteger = new BigInteger(1, array);
        String hex = bigInteger.toString(16);
        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0) {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        } else {
            return hex;
        }
    }

    public static byte[] encryptForPassword(String plainText) throws Exception {
        try {
            byte[] byteText = plainText.getBytes();
            PublicKey publicKey = getPublicKeyForPassword();
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec("SHA-1", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey, oaepParameterSpec);
            return cipher.doFinal(byteText);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static byte[] encryptForDeviceId(String plainText) throws Exception {
        try {
            byte[] byteText = plainText.getBytes();
            PublicKey publicKey = getPublicKeyForDeviceId();
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec("SHA-1", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey, oaepParameterSpec);
            return cipher.doFinal(byteText);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    private static PublicKey getPublicKeyForPassword() throws Exception {
        String publicKeyString = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDE70mr7SEMIvUuLKf1g3/UdIVTVnpD7niRC/P4eT+fkn7YN7xLv9Su5MJ1ths+W/IsP0LVC5k+ZOUSV62rMsmQrhgF0xz2kG1RfUpX0DfTzsYNzMKC5ydx3K1aomDent16SWSTmCXDtDIw+YOmwltVhV55zoD9ylOVlnvkj0NutQIDAQAB";
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] encodedPublicKey = Base64.getDecoder().decode(publicKeyString);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encodedPublicKey);

            return keyFactory.generatePublic(keySpec);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    private static PublicKey getPublicKeyForDeviceId() throws Exception {
        String publicKeyString = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCdoNZfz5MZaaN8AYPnViKiqVn+yJcssiyTpY2t4RYY8ZcacLVHPrc/GyTArFrlb0fwieLyDIiKnTrc7x4m2/PaIcShglY8QhM6HzmLyooIu15/eGr8+jvIoEr9/iFC6YsH7HNjUc7I0gEcLfGs0uIZNYVwCB/2lr0idgNkd9UkvQIDAQAB";
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] encodedPublicKey = Base64.getDecoder().decode(publicKeyString);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encodedPublicKey);

            return keyFactory.generatePublic(keySpec);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static String decryptForPassword(byte[] encryptedText) throws Exception {
        try {
            PrivateKey privateKey = getPrivateKeyForPassword();
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            OAEPParameterSpec oaepParameterSpec = new OAEPParameterSpec("SHA-1", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT);
            cipher.init(Cipher.DECRYPT_MODE, privateKey, oaepParameterSpec);
            return new String(cipher.doFinal(encryptedText));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    private static PrivateKey getPrivateKeyForPassword() throws Exception {
        String privateKeyString = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMTvSavtIQwi9S4sp/WDf9R0hVNWekPueJEL8/h5P5+Sftg3vEu/1K7kwnW2Gz5b8iw/QtULmT5k5RJXrasyyZCuGAXTHPaQbVF9SlfQN9POxg3MwoLnJ3HcrVqiYN6e3XpJZJOYJcO0MjD5g6bCW1WFXnnOgP3KU5WWe+SPQ261AgMBAAECgYBgp2SMCgzvLPUSnX4tpEWH20xYU5gcYR0xayFpcPDF+5tfuTMkJllXIRVDuoXyfCQGjWHauB+VHOXEs92bqYh9KdzdLFLgkhm0i0Vpnol7aj8yHYtJ6dt9p1QZYTwaYDE0crjtOx4mBhCFMik9X8WhRbuKavm9uXVi5COkE60AYQJBAPA+vwE2ZwwuMkibRtBeL5XANXeE2cWWQjFqE8LtOx4CSgB0vHVtzQLw9Jc5Rs76LIHYzrUG7mNDjxdLFPpR0i0CQQDR2XGIv9lcKb0u9Ci1peB1VLs8sTSKBG+UtYWokBhWq0lXHeQsCyI34FdmMeWQzsleN0uWfrHV39TB0aC/rsupAkA595nUrBC/IqJlXHoAqskmg+MivH5jK3c7PxIXlXAPNJQwefpDB0RRMlyB5IMOS9TTW8G8cjiw4Ms03pvoLjfdAkEAiXpSBgvh4544oaU1cmOcnGGJVOanC/CCBUOyr87PEyCeKKOdkzksDr07pOj1g5vlkoLZU1vnN72vDdc+37UtGQJBAKI9JKEexVlO0m/DXizEPcK/lmyClXinhO9a58Q8lWQEmnBpwdRZRebFo8qU2C7zUtr2pEgJP7Ko+9GLc/9MH8k=";
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            byte[] encodedPrivateKey = Base64.getDecoder().decode(privateKeyString);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);

            return keyFactory.generatePrivate(keySpec);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
