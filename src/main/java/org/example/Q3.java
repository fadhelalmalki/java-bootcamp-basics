package org.example;

import java.util.Scanner;

public class Q3 {
    public void convertCurrency() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your amount in USD: ");
        double amountUSD = scanner.nextDouble();

        System.out.print("Enter the exchange rate (USD to EUR): ");
        double exchangeRate = scanner.nextDouble();

        double amountEUR = amountUSD * exchangeRate;

        System.out.println("Amount in EUR = " + amountEUR);
    }
}
