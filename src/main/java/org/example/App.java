package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        String input;
        int numOfChar;


        System.out.print("What is the input string? ");
        input = scanner.nextLine();

        if (input.length() == 0) {
            System.out.println("You must enter a string!");
            return;
        }

        numOfChar = input.length();
        System.out.println("\"" + input + "\" has " + numOfChar + " characters.");
    }
}
