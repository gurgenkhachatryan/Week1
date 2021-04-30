package Week1.day5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("input 3 number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int average = (num1 + num2 + num3) / 3;
        switch (average / 20) {
            case 2:
                System.out.println("C");
                break;
            case 3:
                System.out.println("B");
                break;
            case 4:
                System.out.println("A");
                break;
            default:
                System.out.println("F");
        }
    }
}
