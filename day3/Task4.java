package Week1.day3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input radius");
        double radius= scanner.nextDouble();
        final double pi=3.14159;
        double area=pi*radius*radius;
        double perimeter=2*pi*radius;
        System.out.println("area=" + area);
        System.out.println("perimeter=" + perimeter);

    }
}
