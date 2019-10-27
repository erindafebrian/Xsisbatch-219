package com.xsis.day2.QUIZ;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        double temp1, temp2, temp3, temp4, average ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan suhu ke-1 (in Farenheit) : ");
        temp1=scan.nextDouble();
        System.out.print("Masukkan suhu ke-2 (in Farenheit): ");
        temp2=scan.nextDouble();
        System.out.print("Masukkan suhu ke-3 (in Farenheit): ");
        temp3=scan.nextDouble();

        average=(temp1+temp2+temp3)/3;

        if (average > 60) {
            System.out.println("The Tamperature is Heat Wave");
        }else {
            System.out.println("The Temperature is cold");
        }

    }
}
