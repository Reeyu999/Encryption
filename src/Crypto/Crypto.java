package Crypto;

import java.util.Map;

public class Crypto {

    private String password;
    protected int cryptoKey;
    protected String cryptoPassword;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCryptoKey(int cryptoKey) {
        this.cryptoKey = cryptoKey;
    }

    public String getCryptoPassword() {
        System.out.println(cryptoPassword);
        return cryptoPassword;
    }

    public void crypto(){
        for(int i = 0; i < password.length(); i++){
            char character = (char) (password.charAt(i) + cryptoKey);
            if (cryptoPassword == null)
                cryptoPassword = String.valueOf(character);
            else
                cryptoPassword = cryptoPassword + character;
        }
    }


}
