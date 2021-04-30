package Week1.day5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner=new Scanner(System.in);
                int num= scanner.nextInt();
        switch (num%2){
            case 0:
                System.out.println("the number is a even");
                break;
            default:
                System.out.println("the number is a odd");
        }
    }
}
