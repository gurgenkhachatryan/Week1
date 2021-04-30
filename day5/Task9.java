package Week1.day5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("input Vowel or Consonant");
        Scanner scanner = new Scanner(System.in);
        String tar = scanner.next();

        switch (tar) {
            case "A":
            case "a":
            case "E":
            case "e":
            case "I":
            case "i":
            case "O":
            case "o":
            case "U":
            case "u": {
                System.out.println(tar + " is a Vowel");
                break;
            }
            default: {
                System.out.println(tar + "is a Consonant");
            }
        }

    }
}
