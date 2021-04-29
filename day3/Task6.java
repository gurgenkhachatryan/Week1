package Week1.day3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("plese yor name");
        char char1=scanner.nextLine().charAt(0);
        char char2=scanner.nextLine().charAt(0);
        char char3=scanner.nextLine().charAt(0);
        char char4=scanner.nextLine().charAt(0);
        char char5=scanner.nextLine().charAt(0);
        char char6=scanner.nextLine().charAt(0);
        String name="" + char1 + char2 + char3 + char4 + char5 + char6;
        System.out.println("name=" + name);
        System.out.println("your birth");
        int bith= scanner.nextInt();
        System.out.println("" + name + " " + bith);

            }
}
