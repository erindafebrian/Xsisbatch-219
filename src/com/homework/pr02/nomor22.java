package com.homework.pr02;

import java.util.Scanner;

public class nomor22 {
    public static void main(String[] args) {
        String vehicles;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the type of Vehicle: ");
        vehicles =scan.next();
        switch (vehicles){
            case "m":
                System.out.println("$1");
                break;
            case "c":
                System.out.println("$2");
                break;
            case "t":
                System.out.println("$4");
                break;
            default:
                System.out.println("Error");
                break;
        }

   }
}
