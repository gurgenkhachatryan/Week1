package Week1.day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input double number:");
        double doubleNumber = scanner.nextDouble();
        float floatNumber = (float) doubleNumber;
        System.out.println("doubleNumber=" + doubleNumber);
        System.out.println("floatNumber=" + floatNumber);
        long longNumber=(long) floatNumber;
        System.out.println("\nfloatNumber=" + floatNumber);
        System.out.println("longNumber=" + longNumber);
        int intNumber=(int) longNumber;
        System.out.println("\nlongNumber=" + longNumber);
        System.out.println("intNumber=" + intNumber);
        short shortNumber=(short) intNumber;
        System.out.println("\nintNumber=" + intNumber);
        System.out.println("shortNumber=" + shortNumber);
        byte byteNumber=(byte) shortNumber;
        System.out.println("\nshortNumber=" + shortNumber);
        System.out.println("byteNumber=" +byteNumber);

    }
}
