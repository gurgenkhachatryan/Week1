package com.company.week1.day1;

import java.util.Scanner;

//Given an integer  3-digit number, determine and print the sum of all 3 digits. Input number from console.
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastNumber = number % 10;
        int number1 = number / 10;
        int secondNumber = number1 % 10;
        int firstNumber = number1 / 10;
        int sum = lastNumber + secondNumber + firstNumber;
        System.out.println(" number= " + number + "  sum= " + sum);
    }
}
