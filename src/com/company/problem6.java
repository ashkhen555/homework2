package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem6 {

    public static void main(String[] args) {

        System.out.println("Pls enter weekday number");
        Scanner scanner= new Scanner(System.in);
        int weekday = scanner.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
