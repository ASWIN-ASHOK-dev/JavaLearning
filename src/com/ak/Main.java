package com.ak;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to mortage calculator ");
        System.out.print("Enter the principal amount :");
        int Principal = scanner.nextInt();
        System.out.print("Enter the rate :");
        double monthlyInterestRate = (scanner.nextFloat()/100)/12;
        System.out.print("Enter the time in years :");
        int months = scanner.nextInt()*12;
        Double mortage = Principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months) / (Math.pow(1 + monthlyInterestRate, months) - 1);
        System.out.println("Your Mortage is :- $" + String.format("%.2f", mortage));

    }
}