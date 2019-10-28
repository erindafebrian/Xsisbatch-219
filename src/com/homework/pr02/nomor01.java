package com.homework.pr02;

import java.util.Scanner;

public class nomor01 {
    public static void main(String[] args) {
        int angka, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        angka=scan.nextInt();
        hasil = angka%6;

        if (hasil == 0 && hasil!=0){
            System.out.println("The number is multiple of 6" );
            System.out.println("Because the modulus devided by 6 is: " +hasil);

        } else {
            System.out.println("The number is not multiple of 6");
            System.out.println("Because the modulus devided by 6 is: " +hasil);
        }

    }
}
