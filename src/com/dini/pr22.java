package com.dini;

import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        char vehicle;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your vehicle: ");
        vehicle=scan.next().charAt(0);
        switch (vehicle){
            case 'm':
                System.out.println("$1");
                break;
            case 'c':
                System.out.println("$2");
                break;
            case 't':
                System.out.println("$4");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
