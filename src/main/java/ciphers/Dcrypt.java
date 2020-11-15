package ciphers;

import static ciphers.Crypt.encrypting;

public class Dcrypt {
    public static String decrypting(String letters, int key){
        return encrypting(letters, 26-key);

    }
}
