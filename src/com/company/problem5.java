package com.company;

import com.sun.jdi.CharValue;
import com.sun.jdi.Value;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class problem5 {

    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt();
        int number2 = random.nextInt();
        System.out.println(number1);
        System.out.println(number2);

        System.out.println("pls insert an operator");

        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next();
        String text=operator;

        boolean result=operator.equals(text);

        switch (text) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
        }
    }
}//cragirn el asec poxem if:)
