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


}