package com.homework.pr02;

import java.util.Scanner;

public class nomor14 {
    public static void main(String[] args) {
        int month;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the month in number : ");
        month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Fall (Autumn)");
                break;
            case 10:
                System.out.println("Fall (Autumn)");
                break;
            case 11:
                System.out.println("Fall (Autumn)");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("There no months in that number");
                break;

        }
    }
}
