package com.company.week1.day1;//Given int numbers ,input a and b from console, determine and print the reminder from deleting  a to b

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        int balance = a % b;
        System.out.println("balance=" + balance);
    }
}
