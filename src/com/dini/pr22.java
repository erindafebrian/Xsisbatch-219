package com.dini;

import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        String vehicle;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your vehicle: ");
        vehicle=scan.next();
        vehicle = vehicle.toUpperCase();
        switch (vehicle){
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
