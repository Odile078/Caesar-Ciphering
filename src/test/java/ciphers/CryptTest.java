package ciphers;

import org.junit.Test;

import static org.junit.Assert.*;

public class CryptTest {
    @Test
    public void testIfCrypt_instantiatesCorrectly() {
        Crypt testCrypt = new Crypt("anne", 4);
        assertEquals(true, testCrypt instanceof Crypt);
    }

}