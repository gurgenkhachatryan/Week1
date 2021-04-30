package Week1.day5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "bar";
        String str2 = "bar";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String s1 = new String("bar");
        String s2 = new String("bar");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
