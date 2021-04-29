package com.company.week1.day1;

import java.util.Scanner;

//Given an integer  3-digit number, determine and print the first digit. Input number from console.
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firsNumber = number / 100;
        System.out.println(" number= " + number + " firstNumber= " + firsNumber);
    }
}
