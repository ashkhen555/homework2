package com.company;

import java.util.Random;

public class problem3 {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(90) + 10;
        double result = Math.pow(number, 2);
        String text = String.valueOf(result);
        System.out.println(text);
    }
}
