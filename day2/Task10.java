package com.company.week1.day1;//Given int number,input from console, find last digit and print it.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastNumber = number % 10;
        System.out.println("number=" + number + "   lastNumber=" + lastNumber);
    }
}
