package org.example;

import java.util.Scanner;

public class Q1 {

    public void calculateBMI() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI = %.2f%n", bmi);
    }
}
