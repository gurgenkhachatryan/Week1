package com.company.week1.day1;

import java.util.Random;

//Generate and print random integer number between 15 to 30
public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(15);
        int number = 15 + randomNumber;
        System.out.println("randomNumber(15,30)=" + number);
    }
}
