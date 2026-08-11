package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        // Q1: To calculate BMI
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI = %.2f%n", bmi);

        System.out.println("#####################################");

        // Q2: To calculate the percentage
        System.out.print("Enter your obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        System.out.print("Enter your total marks: ");
        double totalMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("The percentage is = " + percentage + "%");

        System.out.println("#####################################");

        // Q3: To convert currency
        System.out.print("Enter your amount in USD: ");
        double amountUSD = scanner.nextDouble();

        System.out.print("Enter the exchange rate (USD to EUR): ");
        double exchangeRate = scanner.nextDouble();

        double amountEUR = amountUSD * exchangeRate;

        System.out.println("Amount in EUR = " + amountEUR);

        System.out.println("#####################################");
        scanner.nextLine();

        // Q4: the use of StringBuilder
        System.out.print("Enter any string: ");
        String text = scanner.nextLine();

        int length = text.length();

        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();

        System.out.println("Length of the string: " + length);
        System.out.println("Reversed string: " + reversedText);

        System.out.println("#####################################");

        // Q5: To extract substring
        System.out.print("Enter any sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        String substring = sentence.substring(startIndex, endIndex);

        System.out.println("The extracted substring is: \"" + substring + "\"");

        System.out.println("#####################################");
        scanner.nextLine();

        // Q6: To find a keyword in any sentence
        System.out.print("Enter any sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.print("Enter a keyword: ");
        String keyword = scanner.nextLine();

        boolean isPresent = inputSentence.contains(keyword);
        System.out.println(isPresent ? "Keyword \"" + keyword + "\" is present in the sentence." : "Keyword \"" + keyword + "\" is not present in the sentence.");

        System.out.println("#####################################");

        // Q7: To replace a word in any sentence
        System.out.print("Enter any sentence: ");
        String anySentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        String modifiedSentence = anySentence.replace(wordToReplace, replacementWord);

        System.out.println("Modified sentence: \"" + modifiedSentence + "\"");

        System.out.println("#####################################");

        // Q8: To check for equality
        System.out.print("Enter String 1: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String string2 = scanner.nextLine();

        boolean isEqual = string1.equalsIgnoreCase(string2);

        System.out.println(isEqual ? "Strings are equal (ignoring case)" : "Strings are not equal (ignoring case)" );

    }
}
