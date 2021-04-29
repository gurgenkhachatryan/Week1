package Week1.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("input Fahrenhait");
        Scanner scanner=new Scanner(System.in);
        int fahrenhait= scanner.nextInt();
        double celsius=(fahrenhait-32)/1.8;
        System.out.println("fahrenhait=" + fahrenhait);
        System.out.println("celsius=" + celsius);
        float floatCelsius=(float) celsius;
        System.out.println("floatCelsius=" + floatCelsius);
        int intCelsius=(int) floatCelsius;
        System.out.println("intCelsius=" + intCelsius);
    }
}
