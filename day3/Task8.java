package Week1.day3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("name=" + name);
       int erk=name.length();
        System.out.println("erk=" + erk);
        int tiv1=(int)name.charAt(0);
        int tiv2=(int)name.charAt(1);
        int tiv3=(int)name.charAt(2);
        int tiv4=(int)name.charAt(3);
        int tiv5=(int)name.charAt(4);
        int tiv6=(int)name.charAt(5);
        double average=(tiv1+tiv2+tiv3+tiv4+tiv5+tiv6)/6;
        System.out.println(name + "--" + average);

    }
}
