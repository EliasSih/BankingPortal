package dev.elisih.bankPortal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hashing {
    public static String HashString(String input)
    {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);

            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            // return the HashText
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // main function
    public static void main(String args[]) throws NoSuchAlgorithmException
    {
        System.out.println("HashCode Generated by SHA-1 for: ");

        String s1 = "Elias Sihlangu";
        System.out.println("\n" + s1 + " : " + HashString(s1));

        String s2 = "Elias Sihlangu";

        if(s1.equals(s2)){
            System.out.println("Valid");
        }
        else {
            System.out.println("invalid");
        }
        System.out.println("\n" + s2 + " : " + HashString(s2));
    }
}
