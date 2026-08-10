package org.example;

import java.util.Scanner;

public class Q6 {
    public void checkKeyword() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a keyword: ");
        String keyword = scanner.nextLine();

        if (sentence.contains(keyword)) {
            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
        } else {
            System.out.println("Keyword \"" + keyword + "\" is not present in the sentence.");
        }
    }
}
