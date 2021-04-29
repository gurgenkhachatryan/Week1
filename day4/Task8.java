package Week1.day4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if ((k > 2) && (k != 7) && (k != 8)) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}
