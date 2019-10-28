package com.homework.pr02;

import java.util.Scanner;

public class nomor06 {
    public static void main(String[] args) {
        int angka1, angka2, angka3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the longest than the other: ");
        angka1 = scan.nextInt();
        System.out.print("Enter the second length: ");
        angka2 = scan.nextInt();
        System.out.print("Masukkan the third length: ");
        angka3 = scan.nextInt();
        if(angka1<(angka2+angka3)){
            System.out.println("bilangan yang anda masukkan memungkinkan panjang - panjang segitiga");
        } else {
            System.out.println("bilangan yang anda masukkan tidak memungkinkan menjadi panjang - panjang segitiga");
        }
    }
}
