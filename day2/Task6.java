package Week1.day2;

import java.util.Scanner;

// Input from console 3 arguments and then prints the sum, the difference, the average;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        int difference = num1 - num2 - num3;
        float average = sum / 3;
        System.out.println("sum=" + sum + " difference=" + difference + " average=" + average);
    }
}
