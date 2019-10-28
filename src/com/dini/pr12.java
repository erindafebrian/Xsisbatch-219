package com.dini;

import java.util.Scanner;

public class pr12 {
    static final double vo = 0;
    public static void main(String[] args) {
        double time, a1, a2, s1, s2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan waktu yang dibituhkan kedua mobil: ");
        time=scan.nextDouble();
        System.out.print("Masukkan percepatan mobil pertama: ");
        a1 = scan.nextDouble();
        System.out.print("Masukkan percepatan mobil kedua: ");
        a2=scan.nextDouble();
        s1 = vo + (.5*a1*time*time);
        s2 = vo + (.5*a2*time*time);
        if(s1>s2){
            System.out.println("Car A is First");
        } else if(s2>s1){
            System.out.println("Car B is First");
        } else{
            System.out.println("Car a and B are same");
        }
    }
}
