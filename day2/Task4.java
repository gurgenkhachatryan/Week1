package Week1.day2;

import java.util.Scanner;

//Write a Java program  that takes two numbers as input from the console and display the product of two numbers
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        System.out.print(num1 + "*" + num2 + "=" + product);
    }
}
