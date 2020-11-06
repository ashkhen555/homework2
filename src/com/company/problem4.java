package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int newNumber;
        if (userNumber > 100) {
            Random random = new Random();
            newNumber = random.nextInt(userNumber - 50) + 50;
        } else if (userNumber == 100) {
            newNumber = 50;
        } else {
            Random random = new Random();
            newNumber = random.nextInt(50);
        }
        String text = String.valueOf(newNumber);
        System.out.println(text);
    }
}
