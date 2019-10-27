package com.homework.pr02;

import java.util.Scanner;

public class nomor08 {
    public static void main(String[] args) {
        int a,b,c, mean;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 : ");
        a = scan.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        b=scan.nextInt();
        System.out.print("Masukkan nilai 3 : ");
        c = scan.nextInt();

        mean=(a+b+c)/3;

        if (mean > 8){
            System.out.println("Rata-ratanya adalah " + mean + " (Berkualitas)");
        } else {
            System.out.println("Rata-ratanya adalah " + mean + " (Didiskualifikasi)");
        }
    }
}
