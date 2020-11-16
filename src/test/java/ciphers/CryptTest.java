package ciphers;

import org.junit.Test;

import static org.junit.Assert.*;

public class CryptTest {
    @Test
    public void testIfCrypt_instantiatesCorrectly() {
        Crypt testCrypt = new Crypt("anne", 4);
        assertEquals(true, testCrypt instanceof Crypt);
    }

    @Test
    public void testIfCrypt_getskey_4() {
        Crypt testCrypt = new Crypt("anne", 4);
        assertEquals(4, testCrypt.getKey());
    }

    @Test
    public void testIfCrypt_getstext_Anne() {
        Crypt testCrypt = new Crypt("anne", 4);
        assertEquals("anne", testCrypt.getText());
    }
    @Test
    public void testIfCryptionOfletterWork() {

        int key = 2;
        String letters = "mama";
        String expectedincryption = "ococ";
        assertEquals(expectedincryption, Crypt.encrypting( letters, key ));
    }
    @Test
    public void testIfEncrytionWithNumberWork() {

        int key = 2;
        String letters = "1";
        String expectedincryption = "Use letters only";
        assertEquals(expectedincryption, Crypt.encrypting( letters, key ));
    }
    @Test
    public void testIfletterisUpperCaseWork() {

        int key = 2;
        String letters = "M";
        String expectedincryption = "O";
        assertEquals(expectedincryption, Crypt.encrypting( letters, key ));
    }

    @Test
    public void testIfletterisLowerCaseWork() {

        int key = 2;
        String letters = "m";
        String expectedincryption = "o";
        assertEquals(expectedincryption, Crypt.encrypting( letters, key ));
    }






}