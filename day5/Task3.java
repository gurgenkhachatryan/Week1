package Week1.day5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input integer value");
        int intValue = scanner.nextInt();
        String posNeg = (intValue > 0) ? "positive" : "negative";
        System.out.println("posNeg=" + posNeg);

        int tiv = scanner.nextInt();
        String posNeg1 = (tiv >= 0) ? (tiv > 0 ? "positiv" : "its 0") : "negative";
        System.out.println("posNeg1=" + posNeg1);
    }
}
