package com.homework.pr02;

import java.util.Scanner;

public class nomor22 {
    public static void main(String[] args) {
        String vehicles;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the type of Vehicle: ");
        vehicles =scan.next();
        vehicles = vehicles.toUpperCase();
        switch (vehicles){
            case "M":
                System.out.println("$1");
                break;
            case "C":
                System.out.println("$2");
                break;
            case "T":
                System.out.println("$4");
                break;
            default:
                System.out.println("Error");
                break;
        }

   }
}
