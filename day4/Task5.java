package Week1.day4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // greatest number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 3 numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int max;
        if (number1 > number2 && number1 > number3) {
            max = number1;
            System.out.println("max=number1=" + max);
        } else if (number2 > number1 && number2 > number3) {
            max = number2;
            System.out.println("max=number2=" + max);

        } else {
            max = number3;
            System.out.println("max=number3=" + max);
        }
    }
}
