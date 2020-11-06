package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem9 {

    public static void main(String[] args) {

        Random random = new Random();
        int number1 = random.nextInt(50) + 25;
        int number2 = random.nextInt(50) + 25;
        System.out.println(number1);
        System.out.println(number2);

        String text1 = String.valueOf(number1);
        String text2 = String.valueOf(number2);

        boolean compair;
        if (text1.contentEquals(text2)) compair = true;
        else compair = false;

        System.out.println(compair);
    }
}
