package Week1.day3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("input value int 32 to 127");
        Scanner scanner=new Scanner(System.in);
        int intNumber= scanner.nextInt();
        char charNumber=(char) intNumber;
        System.out.println(intNumber + "-" + charNumber);
    }
}
