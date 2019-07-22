package Crypto;


public class Decrypto {

    private int decryptoKey;
    private String decryptoPassword;

    public void setDecryptoKey(int decryptoKey) {
        this.decryptoKey = decryptoKey;
    }

    public String getDecryptoPassword() {
        System.out.println(decryptoPassword);
        return decryptoPassword;
    }

    public void decrypto(String password){
        for(int i = 0; i < password.length(); i++){
            char character = (char) (password.charAt(i) - decryptoKey );
            if (decryptoPassword == null)
                decryptoPassword = String.valueOf(character);
            else
                decryptoPassword = decryptoPassword + character;
        }

    }

}
