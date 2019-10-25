package com.homework;

import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args) {
        int input, hasil;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter an Integer  : ");

        input = scan.nextInt();
        hasil = (input+1)%2;
        System.out.println("The result is : "+hasil);

    }
}
