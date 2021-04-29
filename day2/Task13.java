package com.company.week1.day1;

import java.util.Random;

//Generate and print random integer number between 0 to 15(bound)
public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(15);
        System.out.println("randomNumber(0,15)=" + randomNumber);
    }
}
