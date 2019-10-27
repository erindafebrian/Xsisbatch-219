package com.homework.pr02;

import java.util.Scanner;

public class nomor13 {
    public static void main(String[] args) {
        int angka;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        angka = scan.nextInt();

        if (angka >= 0 && angka < 10) {
            System.out.println("Anda memasukkan 1 digit nomer");
        } else if (angka >= 10 && angka < 100) {
            System.out.println("Anda memasukkan 2 digit nomer");
        } else if (angka >= 100 && angka < 1000) {
            System.out.println("Anda memasukkan 3 digit nomer");
        } else {
            System.out.println("Anda memasukkan lebih dari 3 digit angka");
        }
    }
}
