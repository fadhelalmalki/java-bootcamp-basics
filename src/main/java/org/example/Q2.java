package org.example;

import java.util.Scanner;

public class Q2 {
    public void calculatePercentage() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        System.out.print("Enter your total marks: ");
        double totalMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("The percentage is = " + percentage + "%");
    }
}
