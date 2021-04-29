package Week1.day4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("input  coordinates");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if ((x1 > 0 && y1 > 0) && (x2 > 0 && y2 > 0))
            System.out.println("in 1 quarter");
        else if ((x1 < 0 && y1 > 0) && (x2 < 0 && y2 > 0)) {
            System.out.println("in 2 quarter");
        } else if ((x1 < 0 && y1 < 0) && (x2 < 0 && y2 < 0)) {
            System.out.println("in 3 quarter");
        } else if ((x1 > 0 && y1 < 0) && (x2 > 0 && y2 < 0)) {
            System.out.println("in 4 quarter");
        } else
            System.out.println("are in different coordinate systems");
    }
}
