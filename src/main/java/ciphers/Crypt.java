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
    public static String encrypting(String letters, int key ){
        String msg = "the key must be between 1 and 26!";
        String txtmsg = "Use letters only";

        StringBuilder cryptedtext = new StringBuilder();
        for(char letter : letters.toCharArray()){
            if(Character.isLetter(letter)){
                if(Character.isUpperCase(letter)){
                    cryptedtext.append((char) ('A' + (letter - 'A' + key) % 26 ));
                }
                else if(Character.isLowerCase(letter)){
                    cryptedtext.append((char) ('a' + (letter - 'a' + key) % 26 ));
                }
            }
            else{
                return txtmsg;
            }
        }
        return cryptedtext.toString();
    }
}
