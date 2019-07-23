package Decrypto;


public class Decrypto {

    private int decryptoKey;
    private String decryptedPassword;

    // USTAWIANIE KLUCZA ODSZYFROWUJĄCEGO
    public void setDecryptoKey(int decryptoKey) {
        this.decryptoKey = decryptoKey;
    }

    // POBIERANIE ODSZYFROWANEGO TESKTU
    public String getDecryptedPassword() {
        return decryptedPassword;
    }

    public void decrypto(String password){
        for(int i = 0; i < password.length(); i++){
            char character = (char) (password.charAt(i) - decryptoKey );
            if (decryptedPassword == null)
                decryptedPassword = String.valueOf(character);
            else
                decryptedPassword = decryptedPassword + character;
        }

    }

}
