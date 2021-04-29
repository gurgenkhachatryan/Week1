package Week1.day4;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int cucich = 0;
        if ((num1 == num2) && (num1 == num3)) {
            cucich = 3;
            System.out.println("maches=" + cucich);
        } else if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
            cucich = 2;
            System.out.println("maches=" + 2);
        } else {
            System.out.println("There are no matches");
        }


    }
}
