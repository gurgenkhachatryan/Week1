package Week1.day4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if (number == 0) {
            System.out.println("number is a zero:  small");
        } else if (number > 0) {
            System.out.println("number is a positive");
            if (number > 1000000) {
                System.out.println("large");
            }
        } else {
            System.out.println("number is a negative:  large");
        }
    }
}
