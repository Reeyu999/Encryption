import Crypto.CryptoFile;
import Crypto.CryptoPassword;
import Decrypto.Decrypto;

import java.io.IOException;


public class Test {

    public static void main(String[] args) throws IOException {

        String file;
        String cryptedPassword;
        String cryptedFile;
        String password = "szklanka";

        CryptoPassword testPassword = new CryptoPassword();
        CryptoFile testFile = new CryptoFile();

        Decrypto testDecryptoPassword= new Decrypto();
        Decrypto testDecryptoFile = new Decrypto();

        //TEST SZYFROWANIA HASŁA
        testPassword.setCryptoPasswordKey(5);
        cryptedPassword = testPassword.cryptThePassword(password);
        System.out.println(testPassword.getCryptedPassword());

        // TEST SZYFROWANIA PLIKU TEKSTOWEGO
        file = testFile.readFile("C:\\Users\\mrejowski\\Desktop\\test.txt");
        testFile.setCryptoFileKey(2);
        cryptedFile = testFile.cryptTheFile(file);
        System.out.println(testFile.getCryptedFile());

        // TEST ODSZYFROWYWANIA HASŁA
        testDecryptoPassword.setDecryptoKey(5);
        testDecryptoPassword.decrypto(cryptedPassword);
        System.out.println(testDecryptoPassword.getDecryptedPassword());

        // TEST ODSZYFROWYWANIA PLIKU
        testDecryptoFile.setDecryptoKey(2);
        testDecryptoFile.decrypto(cryptedFile);
        System.out.println(testDecryptoFile.getDecryptedPassword());
    }



}
