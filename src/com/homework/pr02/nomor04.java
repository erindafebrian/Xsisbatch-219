package com.homework.pr02;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class nomor04 {
    public static void main(String[] args) {
        int angka, hasil;
        Scanner scan= new Scanner(System.in);
        System.out.print("Input any integer: ");
        angka=scan.nextInt();

        if (angka>=1000 && angka<=9999){
            System.out.println("The given integer is four digit integer");
        } else if (angka>9999){
            System.out.println("The given integer is more than four digit integer");
        }else {
            System.out.println("The given integer is less than four digit integer");
        }
    }
}
