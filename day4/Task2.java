package Week1.day4;

import java.util.Scanner;

// odd or even //
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");
        int number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println("number= " + number + " is a even");
        } else
            System.out.println("number= " + number + " is a odd");

    }
}
