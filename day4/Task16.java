package Week1.day4;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("input 3 number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double D, x1, x2;
        D = (b * b) - (4 * a * c);
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("D>0,x1=" + x1 + "\n x2=" + x2);
        } else if (D == 0) {
            x1 = -b / 2 * a;
            System.out.println("D=0 x1=x2=" + x1);
        } else {
            System.out.println("can't be");
        }

    }

}
