package Week1.day5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter an operator");
        String op = scanner.next();
        switch (op) {
            case "+":
                double tivGum = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + tivGum);
                break;
            case "-":
                double tivHan = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + tivHan);
                break;
            case "*":
                double tivBaz = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + tivBaz);
                break;
            case "/":
                double tivBaj = num1 / num2;
                System.out.println(num1 + "*" + num2 + "=" + tivBaj);
                break;
            default:
                System.out.println(" input valid operator");
        }

    }
}
