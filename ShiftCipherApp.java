
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class ShiftCipherApp {
    public static void main (String[] args)
    {
    Scanner sc = new Scanner (System.in);
    int shift;

    String message;

    System.out.println ("Shift Cipher Algorithm Quiz");
    System.out.println("===========================");
    System.out.print(" How many shift do you want to use? ");
    try {
        shift = sc.nextInt();
        sc.nextLine(); 
    } catch (Exception e) {
    System.out.println("That is not an integer.");
    System.exit(0);
    return;
    }
    System.out.print("Please enter a message to hit enter to encrypt it: ");
    message = sc.nextLine();
    sc.close();

    ShiftCipher vija = new ShiftCipher (message, shift);

    vija.cipher();
    System.out.println("Encrypted: " + vija.getCiphered());

    vija.decipher();
    System.out.println ("Decrypted:" + vija.getDeciphered());
    }
    }
    
}
