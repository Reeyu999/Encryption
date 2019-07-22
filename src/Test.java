import Crypto.Crypto;
import Crypto.Decrypto;


public class Test {

    public static void main(String[] args) {

        String cryptoPassword;
        String password = "ojxy%ufs%rjsif%\u007Fqtxqn|f%n%fqptmtqnp";

        Crypto test = new Crypto();
        Decrypto test2 = new Decrypto();

        test.setCryptoKey(0);
        test.setPassword(password);
        test.crypto();
        cryptoPassword = test.getCryptoPassword();

        test2.setDecryptoKey(5);
        test2.decrypto(cryptoPassword);
        test2.getDecryptoPassword();

    }



}
