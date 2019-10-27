package com.xsis.day2.QUIZ;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int angka;
        Scanner scan=new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        angka=scan.nextInt();

        if (angka >= 0) {
            System.out.println("positif");
        } else {
            System.out.println("negatif");
        }
    }
}
