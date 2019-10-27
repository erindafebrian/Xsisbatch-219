package com.xsis.day2.QUIZ;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        String kata,jadi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kata/ Kalimat : ");
        kata=scan.nextLine();
        jadi=kata.toUpperCase();

        if (kata.equals(jadi)) {
            System.out.println("Uppercase");
        } else {
            System.out.println("It is lowercase");
        }
    }
}
