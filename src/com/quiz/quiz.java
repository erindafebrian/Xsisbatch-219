package com.quiz;

import java.util.Scanner;

public class quiz {
    static final int total= 180;
    public static void main(String[] args) {
    int sudut1, sudut2, sudut3 ;
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan sudut 1: ");
        sudut1 = scan.nextInt();
        System.out.println("Masukkan sudut 2: ");
        sudut2 = scan.nextInt();
        sudut3 = total - sudut1 - sudut2;
        System.out.println("Sudut 3 : " + sudut3);
    }
}
