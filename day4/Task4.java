package Week1.day4;

import java.util.Scanner;

//5- i bazmapatik //
public class Task4 {
    public static void main(String[] args) {
        System.out.println("input number is a multiple of a 5");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 5 == 0 || number % 5 == 5) {
            System.out.println("is a multiple of a 5");
        } else
            System.out.println("is a don't multiple of a 5");
    }
}
