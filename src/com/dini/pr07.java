package com.dini;

import java.util.Scanner;

public class pr07 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hipotenusa: ");
        a = scan.nextInt();
        System.out.print("Enter the high: ");
        b = scan.nextInt();
        System.out.print("Enter the base: ");
        c = scan.nextInt();
        if(a == Math.sqrt(Math.pow(b,2) + Math.pow(c,2)) && b== Math.sqrt(Math.pow(a,2) - Math.pow(c,2)) && c == Math.sqrt(Math.pow(a,2) - Math.pow(b,2))){
            System.out.println("Segitiga siku - siku");
        }else {
            System.out.println("Bukan siku - siku");
        }
    }
}
