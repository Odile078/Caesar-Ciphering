package ciphers;

import static ciphers.Crypt.encrypting;

public class Dcrypt {
    private int key;
    private String letters;

    public Dcrypt( String letters,int key) {
        this.key = key;
        this.letters = letters;
    }

    public int getKey() {

        return key;
    }

    public String getText() {

        return letters;
    }

    public static String decrypting(String letters, int key){
        return encrypting(letters, 26-key);

    }
}
