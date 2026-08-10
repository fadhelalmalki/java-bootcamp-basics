package org.example;

import java.util.Scanner;

public class Q5 {
    public void extractSubstring() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        String substring = sentence.substring(startIndex, endIndex);

        System.out.println("The extracted substring is: \"" + substring + "\"");
    }
}
