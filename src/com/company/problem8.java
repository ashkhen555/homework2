package com.company;

import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {

        System.out.println("------------MENU-----------\n" +
                "-- enter 1 for calculating area of the circle\n" +
                "-- enter 2 for calculating perimeter of the circle\n" +
                "-- enter 3 for exit.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        switch (number) {
            case 1:
                System.out.println("Area is " + area);
                break;
            case 2:
                System.out.println("Perimeter is " + perimeter);
                break;
            case 3:
                System.out.println("Its time to exit");
                break;
            default:
                System.out.println("Please enter 1, 2 or 3");
        }
    }
}
