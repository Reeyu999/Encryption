package Crypto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CryptoFile {
    private int cryptoFileKey;
    static private String fileToCrypto;
    private String cryptedFile;

    // USTAWIANIE KLUCZA SZYFRUJĄCEGO
    public void setCryptoFileKey(int cryptoFileKey) {
        this.cryptoFileKey = cryptoFileKey;
    }

    // POBIERANIE ZAWARTOŚCI PLIKU PO ZASZYFROWANIU
    public String getCryptedFile() {
        return cryptedFile;
    }

    // POBIERANIE ZAWARTOŚCI PLIKU PRZED ZASZYFROWANIEM
    public String getFileToCrypto() {
        return fileToCrypto;
    }

    // METODA ODCZYTUJĄCA PLIK
    public String readFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            String textLine = bufferedReader.readLine();
            do {
                if(fileToCrypto == null){
                    fileToCrypto = "";
                } else {
                    fileToCrypto = fileToCrypto + " " + textLine;
                    textLine = bufferedReader.readLine();
                }
            } while (textLine != null);
        } finally {
            bufferedReader.close();
        }
        return fileToCrypto;
    }

    // METODA SZYFRUJĄCA ZAWARTOŚĆ PLIKU
    public String cryptTheFile (String file) {
        for (int i = 0; i < file.length(); i++) {
            char character = (char) (file.charAt(i) + cryptoFileKey);
            if (cryptedFile == null)
                cryptedFile = String.valueOf(character);
            else
                cryptedFile = cryptedFile + character;
        }
        return cryptedFile;
    }
}
