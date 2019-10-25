package com.homework;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        int input, digit, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        input=scan.nextInt();
        digit= input%10;
        hasil=digit*8;
        System.out.println("The Result is: "+digit + " x 8 = "+hasil);
    }
}
