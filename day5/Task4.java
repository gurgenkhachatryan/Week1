package Week1.day5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input 2 numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        // int max=Math.max(number1,number2);
        // System.out.println("max=" + max);
        int max = (number1 > number2) ? number1 : number2;
        System.out.println("max=" + max);
        int abs = scanner.nextInt();
        // int max2=Math.abs(number2);
        int numberAbs = (abs >= 0) ? abs : (-1 * abs);
        System.out.println("abs=" + numberAbs);
    }
}
