package Week1.day4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("input 3 number");
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 == 0 || side2 == 0 || side3 == 0) {
            System.out.println("Given 3 positive numbers different from 0,");
        } else if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)) {
            System.out.println("is a triangle");
        } else
            System.out.println("is a not triangle");
    }
}
