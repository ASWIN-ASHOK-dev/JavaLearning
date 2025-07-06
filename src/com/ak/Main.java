package com.ak;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ");
        user  = scanner.next();
        System.out.println("Welcome "+user);
    }
}