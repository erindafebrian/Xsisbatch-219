package com.homework.pr02;

import java.util.Scanner;

public class nomor10 {
    static final double tunj = .3;
    public static void main(String[] args) {
        int gaji, jam;
        double bayar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Gross Pay : ");
        gaji=scan.nextInt();
        System.out.println("Enter the time work : ");
        jam=scan.nextInt();

        if (jam > 40) {
            bayar = (gaji*2);
            bayar = bayar - (bayar*tunj);
            System.out.println("The net pay after works more : " + bayar );
        } else if (jam < 40) {
            System.out.println("Sorry your time for working is not enough");
        } else {
            bayar = gaji - (gaji*tunj);
            System.out.println("the gross pay after work is : " +gaji);
        }
    }
}
