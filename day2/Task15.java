package com.company.week1.day1;

import java.util.Scanner;

//Write java program which determines if the given int number is odd,
//      print result(use == operator, use boolean primitive type).
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("num=" + num);
        System.out.println(num % 2 == 1);
    }
}
