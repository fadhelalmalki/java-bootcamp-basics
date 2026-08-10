package org.example;

import java.util.Scanner;

public class Q8 {
    public void compareStrings() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String string2 = scanner.nextLine();

        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
