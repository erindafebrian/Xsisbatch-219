package com.xsis.day2.QUIZ;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        int angka1, angka2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan  angka ke-1 : ");
        angka1= scan.nextInt();
        System.out.println("Masukkan angka ke-2 : ");
        angka2 = scan.nextInt();

        if (angka1>0 && angka2>0) {
            System.out.println("Positif");
        } else {
            System.out.println("There is a negative one");
        }
    }
}
