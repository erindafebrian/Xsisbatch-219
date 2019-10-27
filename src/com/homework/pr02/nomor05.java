package com.homework.pr02;

import java.util.Scanner;

public class nomor05 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first value");
        a=scan.nextInt();
        System.out.print("Input the second value");
        b=scan.nextInt();

        if (a < b) {
            System.out.println("The smallest of the two number is : " + a);
        } else {
            System.out.println("The smallest of the two number is : " + b);
        }
    }
}
