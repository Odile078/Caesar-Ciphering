import ciphers.Crypt;
import ciphers.Dcrypt;

import java.io.Console;

import static java.lang.Integer.*;

public class App {
    public static void main(String[] args) {
        Console myconsole = System.console();
        System.out.println("Enter the number to use for encryption:");
        String encryptNtxt = myconsole.readLine();
        Integer encryptN = Integer.parseInt(encryptNtxt);

        System.out.println("Enter the text you want encrypted:");
        String encrypttxt = myconsole.readLine();
        System.out.println("*********************************");
        System.out.println("-Encryption");

        System.out.println("Here is the encrypted text : "+ Crypt.encrypting( encrypttxt, encryptN ));
        System.out.println("      ----------       ");
        System.out.println("-Decryption");
        System.out.println("Here is your encrypted text decrypted: "+ Dcrypt.decrypting( Crypt.encrypting( encrypttxt, encryptN), encryptN ));


    }
}
