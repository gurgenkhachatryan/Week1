package Week1.day5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("input 3 number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = ((num1 > num2) && (num1 > num3)) ? num1 : ((num2 > num3) ? num2 : num3);
        System.out.println("max=" + max);
    }
}
