package com.homework.pr02;

import sun.font.DelegatingShape;

import java.util.Scanner;

public class nomor02 {
    public static void main(String[] args) {
        int angka, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        angka = scan.nextInt();


        if (angka %6 == 0 && angka%7 == 0){
            System.out.println("The number is multiple of 6 and 7");
        }
        else if (angka %6 == 0){
            hasil   = angka % 6;
            System.out.println("The number is multiple of 6" );
            System.out.println("Because the modulus devided by 6 is: " +hasil);
        }else if (angka%7 == 0) {
            hasil   = angka % 6;
            System.out.println("The number is multiple of 7");
            System.out.println("Because the modulus devided by 7 is: " +hasil);
        }else {
            System.out.println("The number is not multiple of 6 or 7");
        }

    }
}
