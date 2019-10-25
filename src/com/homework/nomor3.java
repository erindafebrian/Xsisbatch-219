package com.homework;

import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        int input, hasil;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter an Integer  : ");
        input = scan.nextInt();
        hasil = (input%2);
        System.out.println("The result is : "+hasil);

    }
}
