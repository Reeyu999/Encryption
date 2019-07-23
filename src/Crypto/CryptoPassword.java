package Crypto;

public class CryptoPassword {


    private int cryptoKey;
    private String cryptedPassword;

    // USTAWIANIE KLUCZA SZYFRUJĄCEGO
    public void setCryptoPasswordKey(int cryptoKey) {
        this.cryptoKey = cryptoKey;
    }

    // POBIERANIE ZASZYFROWANEGO HASŁA
    public String getCryptedPassword() {
        return cryptedPassword;
    }

    // METODA SZYFRUJĄCA HASŁO
    public String cryptThePassword (String password) {
        for (int i = 0; i < password.length(); i++) {
            char character = (char) (password.charAt(i) + cryptoKey);
            if (cryptedPassword == null)
                cryptedPassword = String.valueOf(character);
            else
                cryptedPassword = cryptedPassword + character;
        }
        return cryptedPassword;
    }
}
