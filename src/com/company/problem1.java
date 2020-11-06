package com.company;

import java.util.Random;

public class problem1 {

    public static void main(String[] args) {
        Random random = new Random();
        int numner1 = random.nextInt(90) + 10;
        int number2 = random.nextInt(90) + 10;
        long result = numner1 + number2;
        System.out.println(result);
    }
}
