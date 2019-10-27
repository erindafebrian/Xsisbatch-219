package com.xsis.day2.QUIZ;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        int angka1,angka2,angka3,angka4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka 1 : ");
        angka1 = scan.nextInt();
        System.out.println("Masukkan angka 2 : ");
        angka2 = scan.nextInt();
        System.out.println("Masukkan angka 3 : ");
        angka3 = scan.nextInt();
        System.out.println("Masukkan angka 4 : ");
        angka4 = scan.nextInt();

        if (angka1 < 0 || angka2 < 0 || angka3 < 0 || angka4 < 0) {
            System.out.println("Among the given numbers, there is a negative one!");
        } else {
            System.out.println("All of them are positive");
        }
    }
}
