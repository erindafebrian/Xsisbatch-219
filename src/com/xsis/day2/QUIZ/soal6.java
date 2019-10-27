package com.xsis.day2.QUIZ;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        int angka1, angka2, angka1y, angka2y, ganti;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        angka1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        angka2 = scan.nextInt();

        if (angka1>angka2) {
            angka1y = angka2;
            angka2y = angka1;

            System.out.println("The first number is : " + angka1y);
            System.out.println("The second number is : " + angka2y);
        } else {
            System.out.println("The first number is : " + angka1);
            System.out.println("The second number is : " + angka2);
        }
    }
}
