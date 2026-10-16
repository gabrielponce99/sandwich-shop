package com.pluralsight;

import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to McBurger!");

        double price = 0.0;
        double loadedRegular = 0.0;
        double loadedLarge = 0.0;

        System.out.println("What size would you like?: ");
        int sandwichSize = scanner.nextInt();

        System.out.println("How old are you?: ");
        int age = scanner.nextInt();

        System.out.println("Would you like it loaded? (Y/N): ");
        String extra = scanner.nextLine();

        boolean isRegular = sandwichSize == 1;
        boolean isLarge = sandwichSize == 2;
        
        if (isRegular) {
            price = 5.45;
        } else if (isLarge) {
            price = 8.95;
        }

        if (extra.equals("Y")) {
            if (isRegular) {
                loadedRegular = 1.00;
            } else if (isLarge) {
                loadedLarge = 1.75;
            } else {
                System.out.println("No Loaded.");
            }

        if (age <= 17) {
            price = price * 0.9;
        } else if (age >= 65) {
            price = price * 0.8;
        } else {
            System.out.println("You don't get a discount");
        }

        System.out.println("Your total is: " + price);

    }
}
