package Week1.day4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("input 3 number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max, min = num3, average = num2;
        if ((num1 > num2) && (num1 > num3)) {
            max = num1;
            if (num2 < num3) {
                min = num2;
                average = num3;
            }
        } else if (num2 > num3) {
            {
                max = num2;
            }
            if (num3 > num1) {
                min = num1;
                average = num3;
            } else {
                min = num3;
                average = num1;
            }
        } else {
            max = num3;
            if (num1 > num2) {
                min = num2;
                average = num1;
            } else {
                min = num1;
                average = num2;
            }
        }
        System.out.println("min= " + min + " average= " + average + " max= " + max);
    }
}

