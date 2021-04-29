package com.company.week1.day1;

import java.util.Scanner;

// Given 2 integer numbers, swap them,Input numbers from console.
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(" first= " + first + "   second= " + second);
        int num = second;
        second = first;
        System.out.println(" first= " + num + "   second= " + second);
    }
}
