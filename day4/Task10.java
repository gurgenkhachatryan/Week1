package Week1.day4;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("input number");
        //Scanner scanner=new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("number=" + number);
        boolean tram;
        if ((number >= -1000 && number <= 1000) || (number) % 3 == 0 || (number) % 5 == 0) {
            tram = true;
            System.out.println(tram);
        } else {
            tram = false;
            System.out.println(tram);
        }
    }
}
