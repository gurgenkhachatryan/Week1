package com.company.week1.day1;

import java.util.Scanner;

//Given an integer 3-digit number, determine and print the second digit. Input number from console.
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = number / 10;
        int second = number2 % 10;
        System.out.println("number=" + number + " second=" + second);
    }
}
