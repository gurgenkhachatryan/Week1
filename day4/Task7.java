package Week1.day4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("input number 1-7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1)
            System.out.println("day=Monday");
        else if (number == 2) {
            System.out.println("day=Tuesday");
        } else if (number == 3) {
            System.out.println("day=Wednesday");
        } else if (number == 4) {
            System.out.println("day=Thursday");
        } else if (number == 5) {
            System.out.println("day=Friday");
        } else if (number == 6) {
            System.out.println("day=Saturday");
        } else if (number == 7) {
            System.out.println("day=Sunday");
        } else {
            System.out.println("input number only 1-7");
        }
    }
}
