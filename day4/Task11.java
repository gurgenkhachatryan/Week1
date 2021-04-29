package Week1.day4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean ar;
        boolean br;

        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else if (a > 10) {
            System.out.println("a is legal b is illegal");
        } else if (b != 10) {
            System.out.println("b is legal a is illegal");
        } else
            System.out.println("a and b is a illegal");
        if (a >= 0 && b >= 0) {
            System.out.println("both a and b is positive");
        } else if (a >= 0) {
            System.out.println("a is positive b is b negative");
        } else if (b >= 0) {
            System.out.println("b is positive b is a negative");
        } else {
            System.out.println("a and b negative");
        }

    }
}
