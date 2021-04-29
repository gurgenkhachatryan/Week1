package Week1.day3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input byte number:");
        byte byteNumber = scanner.nextByte();
        short shortNumber = byteNumber;
        System.out.println("byteNumber= " + byteNumber);
        System.out.println("shortNumber= " + shortNumber );
        int intNumber = shortNumber;
        System.out.println();
        System.out.println("\n shortNumber= " + shortNumber);
        System.out.println("intNumber=" + intNumber);
        long longNumber = intNumber;
        System.out.println("\nintNumber= " + intNumber);
        System.out.println("longNumber=" + longNumber);
        float floatNumber=longNumber;
        System.out.println("\nlongNumber=" + longNumber);
        System.out.println("floatNumber=" + floatNumber);
double doubleNumber=floatNumber;
        System.out.println("\nfloatNumber=" + floatNumber);
        System.out.println("doubleNumber=" + doubleNumber);
    }
}
