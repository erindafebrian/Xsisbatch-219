package com.quiz;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        double nilai1, nilai2, nilai3, nilai4, jumlah, mean;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai 1: ");
        nilai1 = scan.nextDouble();
        System.out.println("Masukkan nilai 2: ");
        nilai2 = scan.nextDouble();
        System.out.println("Masukkan nilai 3: ");
        nilai3 = scan.nextDouble();
        System.out.println("Masukkan nilai 4: ");
        nilai4 = scan.nextDouble();
        jumlah = nilai1 + nilai2 + nilai3 + nilai4;
        System.out.println("Tampilkan jumlah : " + jumlah);
        mean = jumlah / 4;
        System.out.println("Tampilkan mean : " + mean);
    }
}
