package com.ak;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Just doing it,so I do not need to run it everytime :)
        while (true)
            fizzBuzz();
    }
    //FizzBuzz Problem
    static void fizzBuzz() {
        System.out.print("Enter a Number:-> ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
    }
}