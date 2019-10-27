package com.homework.pr02;

import java.util.Scanner;

public class nomor21 {
    public static void main(String[] args) {
        double convert, quantity;
        int choice;
        System.out.println("1 : Galoons to liters");
        System.out.println("2 : Liters to Galoons");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter choice: ");
        choice = scan.nextInt();
        System.out.println("Enter the quantity");
        quantity= scan.nextDouble();

        if (choice==1){
            convert = quantity *3785;
            System.out.println("Convert galoons to liters with : " +quantity + " galoons x 3785 is " + convert + " liters");
        } else {
            convert = quantity / 3785;
            System.out.println("Convert galoons to liters with : " +quantity + " liters x 3785 is" + convert + " galoons");
        }
    }
}
