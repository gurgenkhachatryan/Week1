package Week1.day5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the correct letter numbers");


        System.out.println("please write one");
        int tiv1 = scanner.nextInt();
        String answer1 = (tiv1 == 1) ? "Congratulation" : "Invalide choice";
        System.out.println("answer1=" + answer1);


        System.out.println("please write two");
        int tiv2 = scanner.nextInt();
        String answer2 = (tiv2 == 2) ? "Congratulation" : "Invalide choice";
        System.out.println("answer2=" + answer2);

        System.out.println("plase write three");
        int tiv3 = scanner.nextInt();
        String answer3 = (tiv3 == 3) ? "Congratulation" : "Invalide choice";
        System.out.println("answer3=" + answer3);
    }
}
