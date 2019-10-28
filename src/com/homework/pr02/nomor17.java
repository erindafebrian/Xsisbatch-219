package com.homework.pr02;

import java.util.Scanner;

public class nomor17 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";

    public static void main(String[] args) {
        String bilangan;
        int hasil1, hasil2, sisa1, sisa2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input bilangan : ");
        bilangan = scan.next();
        if (bilangan.matches(IS_NUMERIC)) {
           if (Integer.parseInt(bilangan) % 5 == 0 && Integer.parseInt(bilangan) %8 == 0){
               System.out.println("Can devided by 5 and 8 ");
           }else {
               System.out.println("It can not devided by 5 or 8");
           }
        } else {
            System.out.println("Inputan Bukan bilangan numeric");
        }
    }
}
