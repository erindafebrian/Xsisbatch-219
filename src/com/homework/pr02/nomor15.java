package com.homework.pr02;

import java.util.Scanner;

public class nomor15 {
    public static void main(String[] args) {
        double angka, digit1, digit2;
        String a,b,c,d,e,f,g,h,i,j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number (1.0 until 4.9) : ");
        angka = scan.nextDouble();
        a = "nol";
        b = "satu";
        c = "dua";
        d = "tiga";
        e = "empat";
        f = "lima";
        g = "enam";
        h = "tujuh";
        i = "delapan";
        j = "sembilan";


        digit1 = angka;
        digit2 = (angka*10)%10;

        if (digit1 == 1 && digit2 == 0){
            System.out.println(b + " point " + a);
        }else if (digit1 <2 && digit1 >=1 && digit2 == 1) {
            System.out.println(b + " point " + b);
        }else if (digit1 <2 && digit1 >=1 && digit2 == 2) {
            System.out.println(b + " point " + c);
        }else if (digit1 <2 && digit1 >=1&& digit2 == 3) {
            System.out.println(b + " point " + d);
        }else if (digit1 <2 && digit1 >=1&& digit2 == 4) {
            System.out.println(b + " point " + e);
        }else if (digit1 <2 && digit1 >=1&& digit2 == 5) {
            System.out.println(b + " point " + f);
        }else if (digit1 <2 && digit1 >=1&& digit2 == 6) {
            System.out.println(b + " point " + g);
        }else if (digit1 <2 && digit1 >=1&& digit2 == 7) {
            System.out.println(b + " point " + h);
        }else if (digit1 <2 && digit1 >=1&& digit2 == 8) {
            System.out.println(b + " point " + i);
        }else if (digit1 <2 && digit1 >=1&& digit2 == 9) {
            System.out.println(b + " point " + j);
        }

        if (digit1 <3 && digit1 >=2 && digit2 == 0) {
            System.out.println(c + " point " + a);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 1) {
            System.out.println(c + " point " + b);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 2) {
            System.out.println(c + " point " + c);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 3) {
            System.out.println(c + " point " + d);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 4) {
            System.out.println(c + " point " + e);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 5) {
            System.out.println(c + " point " + f);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 6) {
            System.out.println(c + " point " + g);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 7) {
            System.out.println(c + " point " + h);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 8) {
            System.out.println(c + " point " + i);
        }else if (digit1 <3 && digit1 >=2 && digit2 == 9) {
            System.out.println(c + " point " + j);
        }

        if (digit1 <4 && digit1 >=3 && digit2 == 0) {
            System.out.println(d + " point " + a);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 1) {
            System.out.println(d + " point " + b);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 2) {
            System.out.println(d + " point " + c);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 3) {
            System.out.println(d + " point " + d);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 4) {
            System.out.println(d + " point " + e);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 5) {
            System.out.println(d + " point " + f);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 6) {
            System.out.println(d + " point " + g);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 7) {
            System.out.println(d + " point " + h);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 8) {
            System.out.println(d + " point " + i);
        }else if (digit1 <4 && digit1 >=3 && digit2 == 9) {
            System.out.println(d + " point " + j);
        }

        if (digit1 <5 && digit1 >=4 && digit2 == 0) {
            System.out.println(e + " point " + a);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 1) {
            System.out.println(e + " point " + b);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 2) {
            System.out.println(e + " point " + c);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 3) {
            System.out.println(e + " point " + d);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 4) {
            System.out.println(e + " point " + e);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 5) {
            System.out.println(e + " point " + f);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 6) {
            System.out.println(e + " point " + g);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 7) {
            System.out.println(e + " point " + h);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 8) {
            System.out.println(e + " point " + i);
        }else if (digit1 <5 && digit1 >=4 && digit2 == 9) {
            System.out.println(e + " point " + j);
        }
    }
}
