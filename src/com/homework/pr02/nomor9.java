package com.homework.pr02;

import java.util.Scanner;


public class nomor9 {

    public static void main(String[] args) {
        int gaji, jam, bayar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Gross Pay : ");
        gaji=scan.nextInt();
        System.out.println("Enter the time work : ");
        jam=scan.nextInt();

        if (jam > 40) {
            bayar = gaji*2;
            System.out.println("The gross pay after works more : " + bayar);
        } else if (jam < 40) {
            System.out.println("Sorry your time for working is not enough");
        } else {
            System.out.println("the gross pay after work is : " +gaji);
        }
    }
}
