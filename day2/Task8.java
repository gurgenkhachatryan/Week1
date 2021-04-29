package com.company.week1.day1;
//In program we have byte b, short c , int a,  variables, print result of these actions
//      -  print average of them,-  print product of them

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte b = scanner.nextByte();
        short c = scanner.nextShort();
        int a = scanner.nextInt();
        float average = (b + c + a) / 3;
        int product = a * b * c;
        System.out.println("average=" + average);
        System.out.println("product=" + product);
    }
}
