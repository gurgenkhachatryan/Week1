package Week1.day2;

import java.util.Scanner;

//Write a java program which has input number from console, and print the remainder.(use modulo operator)
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int balance = num1 % num2;
        System.out.println(num1 + "%" + num2 + "=" + balance);
    }
}
