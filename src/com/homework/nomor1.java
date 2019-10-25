package com.homework;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        int input, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        input=scan.nextInt();
        hasil= (input%10)*8;
        System.out.println("The Result is: "+hasil);
    }
}
