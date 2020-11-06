package com.company;

import java.util.Random;

public class problem2 {

    public static void main(String[] args) {
        Random random = new Random();
        int numner1 = random.nextInt(90) + 10;
        int number2 = random.nextInt(90) + 10;
        int result = numner1 * number2;
        if (result % 2 == 0) {
            long evenResult = Long.valueOf(result);
            System.out.println(evenResult);
        } else {
            double oddResult = Double.valueOf(result);
            System.out.println(oddResult);
        }

    }
}
