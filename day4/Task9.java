package Week1.day4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // leap year//
        System.out.println("input in number year");
        Scanner scanner = new Scanner(System.in);
        int yearNumber = scanner.nextInt();
        if (yearNumber % 4 == 0) {
            System.out.println("is a leap year");
        } else {
            System.out.println("is a don't leap year");
        }
    }
}
