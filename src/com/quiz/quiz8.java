package com.quiz;

import java.util.Scanner;

public class quiz8 {
        public static void main(String[] args) {
        double totalbelanja, diskon, setelahDiskon, hemat;
            Scanner scan = new Scanner(System.in);
            System.out.println("Total pembelanjaan : ");
            totalbelanja = scan.nextDouble();
            System.out.println("Diskon : ");
            diskon = scan.nextDouble();
            setelahDiskon =  totalbelanja - (diskon/100*totalbelanja);
            System.out.println("Belanjaan Setelah diskon : " +setelahDiskon);
            hemat= totalbelanja-setelahDiskon;
            System.out.println("Hemat yang dilakukan setelah diskon : "+hemat);
    }
}
