package Week1.day5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number 0-9");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                System.out.println("you entered zero");
                break;
            case 1:
                System.out.println("you entered one");
                break;
            case 2:
                System.out.println("you entered two");
                break;
            case 3:
                System.out.println("you entered three");
                break;
            case 4:
                System.out.println("you entered four");
                break;
            case 5:
                System.out.println("you entered five");
                break;
            case 6:
                System.out.println("you entered six");
                break;
            case 7:
                System.out.println("you entered seven");
                break;
            case 8:
                System.out.println("you entered eight");
                break;
            case 9:
                System.out.println("you entered nine");
                break;
            default:
                System.out.println("you are a don't input 0-9");

        }
    }
}