package com.company;  // part of 'com.company' package (folder)

import java.util.Scanner;   // ignore for now

public class Main  // ignore for now (class Main -> Main.java)
                    // public class Yo -> Yo.java
{
    // The MAIN function/method of our program,
    // accepts a parameter of type String array named 'args'.
    // more on this really soon...
    public static void main(String[] args)
    {
        String option;  // define a String
                        // to be used when processing user input

        do  // the main loop of our program
        {
            displayMenuText();  // method/function call
                                // asks the JRE (Java Runtime Environment)
                                // to execute
                                // the instructions contained inside
                                // the method
                                // JRE = JVM (Java Virtual Machine)
                                // JDK = JRE + Java Software Kit
            // Wait for user input
            Scanner scanner0 = new Scanner( System.in );
            // Grabs the user input and saves it inside a variable
            // of type int. Expects numeric values:
            int n = scanner0.nextInt();

            option = "" + n;    // cheap hack to convert the int n
                                // to a String, storing it inside
                                // String option declared above

            switch ( option )   // custom code construct to replace chained
                                // 'if, else if, else' statement
            {
                case "0":   // if option equals "0" (the actual string "0"
                            // not the int 0, not the character '0')
                            // execute the following
                    System.out.println("Bye");
                    System.exit(0);
                    break; // exits the switch construct (which is kinda
                            // like a while loop)

                case "1":
                    System.out.println("Enter a string to encrypt");
                    Scanner scanner1 = new Scanner( System.in ); // Wait for user input, again:
                    String plainText = scanner1.nextLine(); // Grabs the whole line
                                // from the user, and stores it inside the String named
                                // plainText.
                    System.out.println("enter a key"); // prints this
                    Scanner keyScanner1 = new Scanner( System.in ); // Wait for user input, again:

                    int key1 = keyScanner1.nextInt(); // Grabs the user input and saves it
                                                        // inside a variable
                                                        // of type int. Expects numeric
                                                        // values.
                    if( key1 < 1 || key1 > 25 ) // if key1 is less than 1 or greater than
                                                // 25, then print what is below
                    {
                        System.out.println("Wrong/Invalid key");
                        System.exit(-1); // stops all program execution
                                                // with a code of -1
                                                // (more on this later)
                    }
                    System.out.println( encrypt(plainText, key1) ); // Prints the result of
                                                                    // encrypt() method,
                                                                    // taking as parameters
                                                                    // String 'plaintext' and
                                                                    // integer 'key1'
                    break; // exits the switch construct (which is kinda
                             // like a while loop)

                case "2":   // if option equals 2 (as a String literal)
                    System.out.println("Enter a string to decrypt"); // prints this
                    Scanner scanner2 = new Scanner( System.in ); // Wait for user input, again:
                    String cipherText = scanner2.nextLine(); // Grabs the whole line
                                // from the user, and stores it inside the String named
                                // plainText.
                    System.out.println("enter a key");
                    Scanner keyScanner2 = new Scanner( System.in );

                    int key2 = keyScanner2.nextInt();
                    System.out.println( decrypt( cipherText, key2 ) );

                    if( key2 < 1 || key2 > 25 )
                    {
                        System.out.println("Wrong/Invalid key");
                        System.exit(-1);
                    }
                    break;

                default: // default behaves like an else
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("========================");
        }
        while( !option.equals("0") ); // exits the while loop if option = String "0"
                                // otherwise, the loop will continue to
                                // execute.
                                // Option needs to be different than 0 in
                                // order to stay in the loop.



        // String secretMessage = "HELLOWORLD";




//        System.out.println(secretMessage);
//        String encryptedMessage = encrypt(secretMessage, shiftKey);
//
//        System.out.println(encryptedMessage);
//
//        String decryptedMessage = decrypt(encryptedMessage, shiftKey);
//        System.out.println(decryptedMessage);
    }

    static String encrypt(String message, int key)
    {
        key = key % 26 + 26;
        char[] messageChars = message.toCharArray();
        char[] tempArr = new char[messageChars.length];
        for(int i = 0; i< messageChars.length; i++)
        {
            tempArr[i] = (char) ( 'A' + (messageChars[i] - 'A' + key) % 26 );
        }

        return new String(tempArr);
    }

    static String decrypt(String encMessage, int key)
    {
        key = (26 - key) % 26 + 26;
//            key = ~key + 1;
        char[] messageChars = encMessage.toCharArray();
        char[] tempArr = new char[messageChars.length];
        for(int i = 0; i< messageChars.length; i++)
        {
            tempArr[i] = (char) ( 'A' + (messageChars[i] - 'A' + key) % 26 );
        }

        return new String(tempArr);
    }

    static void displayMenuText()
    {
        System.out.println("Press 1 to encrypt");
        System.out.println("Press 2 to decrypt");
        System.out.println("Press 0 to exit");
    }




}

