package Week1.day3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
