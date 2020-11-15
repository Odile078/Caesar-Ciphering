package ciphers;

public class Crypt {
    private int key;
    private String letters;

    public Crypt( String letters,int key) {
        this.key = key;
        this.letters = letters;
    }

    public int getKey() {

        return key;
    }

    public String getText() {
        return letters;
    }

}
