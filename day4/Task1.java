package Week1.day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // age //
        System.out.println("input your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("have a vote");
        } else if (age > 0 && age < 18) {
            System.out.println("don't have a vote");
        } else {
            System.out.println("input number>0");
        }
    }
}
