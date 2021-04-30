package Week1.day5;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number 1-7");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("number=" + "MONDAY");
                break;
            case 2:
                System.out.println("number=" + "Tuesday");
                break;
            case 3:
                System.out.println("number=" + "Wednesday");
                break;
            case 4:
                System.out.println("number=" + "Thursday");
                break;
            case 5:
                System.out.println("number=" + "Friday");
                break;
            case 6:
                System.out.println("number=" + "Saturday");
                break;
            case 7:
                System.out.println("number=" + "Sunday");
                break;
            default:
                System.out.println("number is a don't 1-7");
        }
    }
}
