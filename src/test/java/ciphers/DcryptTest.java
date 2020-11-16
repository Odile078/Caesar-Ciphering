package ciphers;

import org.junit.Test;

import static org.junit.Assert.*;

public class DcryptTest {
    @Test
    public void testIfDecryptinstantiatesCorrectly() {
        Dcrypt testDcrypt = new Dcrypt("Marie", 4);
        assertEquals(true, testDcrypt instanceof Dcrypt);
    }

    @Test
    public void testIfDcrypt_getskey_4() {
        Dcrypt testDcrypt = new Dcrypt("Marie", 4);
        assertEquals(4, testDcrypt.getKey());
    }

    @Test
    public void testIfDcrypt_getstext_Marie() {
        Dcrypt testDcrypt = new Dcrypt("Marie", 4);
        assertEquals("anne", testDcrypt.getText());
    }
}