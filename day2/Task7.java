package com.company.week1.day1;

import java.util.Scanner;
//Write a java program to calculate the square of a
//	-right-angled triangle -square  -rectangle

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tr1 = scanner.nextInt();
        int tr2 = scanner.nextInt();
        int tsquare = tr1 * tr2 / 2;
        System.out.println("trianglesquare=" + tsquare);
        int sq1 = scanner.nextInt();
        int ssquare = sq1 * sq1;
        System.out.println("ssquare=" + ssquare);
        int rect1 = scanner.nextInt();
        int rect2 = scanner.nextInt();
        int rsquare = rect1 * rect2;
        System.out.println("rectanglesquare = " + rsquare);
    }
}
