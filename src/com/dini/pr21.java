package com.dini;

import java.util.Scanner;

public class pr21 {
    public static void main(String[] args) {
        int choice;
        double quantity, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Gallons to litter");
        System.out.println("2. Litter to Gallons");
        System.out.print("Enter your choice: ");
        choice = scan.nextInt();
        System.out.print("Enter the quantity: ");
        quantity = scan.nextDouble();
        switch (choice) {
            case 1:
                result = quantity * 3.785;
                System.out.println("The answer is: "+result);
                break;
            case 2:
                result = quantity/3.785;
                System.out.println("The answer is: "+result);
                break;
            default:
                System.out.println("Ops, something wrong...");
        }
    }
}
