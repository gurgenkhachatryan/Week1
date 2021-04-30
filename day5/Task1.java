package Week1.day5;


import java.util.Scanner;

/// equals ///
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input text1");
        String text1 = scanner.nextLine();
        System.out.println("input text2");
        String text2 = scanner.nextLine();
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));

    }
}
