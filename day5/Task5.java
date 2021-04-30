package Week1.day5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String s = null;

        int name1 = (s == ("")) ? 0 : (s == null ? -1 : 1);
        System.out.println("name1=" + name1);
        String s1 = "";
        int nam2 = s1 == "" ? 0 : (s1 == null ? -1 : 1);
        System.out.println("name2=" + nam2);
    }
}
