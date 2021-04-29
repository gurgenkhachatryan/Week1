package com.company.week1.day1;

import java.util.Random;

//Generate and print random integer number;
public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt();
        System.out.println("randomNumber=" + randomNumber);
    }
}
