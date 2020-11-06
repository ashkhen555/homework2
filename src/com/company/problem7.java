package com.company;

import java.util.Scanner;

public class problem7 {

    public static void main(String[] args) {

        System.out.println("Pls enter some month name");
        Scanner scanner= new Scanner(System.in);
        String monthName = scanner.nextLine();

        switch (monthName) {
            case "January", "March", "May", "July", "August", "October", "December":
                System.out.println("31 days");
                break;
            case "February":
                System.out.println("28 or 29 days");
                break;
            case "April", "June", "September", "November":
                System.out.println("30 days");
                break;
        }
    }
}
