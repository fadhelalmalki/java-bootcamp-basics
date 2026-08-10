package org.example;

import java.util.Scanner;

public class Q4 {

    public void reverseString() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String text = scanner.nextLine();

        int length = text.length();

        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();

        System.out.println("Length of the string: " + length);
        System.out.println("Reversed string: " + reversedText);
    }
}
