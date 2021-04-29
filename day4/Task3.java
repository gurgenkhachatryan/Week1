package Week1.day4;

import java.util.Random;
///// Random 2-7 ///
public class Task3 {
    public static void main(String[] args) {
        System.out.println("print random number");
        Random random = new Random();
        int num = random.nextInt();
        if (num < 0) {
            num = num * (-1);
        }
        int k =2+ num % 6;
               System.out.println("k=" + k);
        /*if (num >= 2 && num <= 7) {
            System.out.println("num=" + num);*/
    }
}

