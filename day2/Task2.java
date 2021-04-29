package Week1.day2;

import java.util.Scanner;

// Write a Java program to convert minutes into a number of hours,
// print count of hours and minutes. Input minutes from console
public class Task2 {


    public static void main(String[] args) {
        System.out.println("input minute");
        Scanner scanner = new Scanner(System.in);
        int minute = scanner.nextInt();
        //float hours = (float)minute/60;
        System.out.println("minutes = " + minute);
        int hours = minute / 60;
        int min = minute % 60;
        System.out.println(minute + " minutes = " + hours + " hours " + min + " minutes ");
    }
}