package com.homework.pr02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class nomor07 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first integer (a) : ");
        a = scan.nextInt();
        System.out.print("Input the second integer (b): ");
        b = scan.nextInt();
        System.out.print("Input the third integer (c) or the longest : ");
        c = scan.nextInt();

       if (a == Math.sqrt(Math.pow(c,2) - Math.pow(b,2)) &&  b == Math.sqrt(Math.pow(c,2) - Math.pow(a,2)) &&
               c == Math.sqrt(Math.pow(a,2) + Math.pow(b,2))) {
            System.out.println("That is the the right triangle");
        } else {
            System.out.println("That is not the right triangle");
        }
    }
}
