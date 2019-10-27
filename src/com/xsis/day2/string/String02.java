package com.xsis.day2.string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        String kata, reverse;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kata : ");
        kata = scan.next();
        System.out.println("Hasil : "+kata);
        reverse=" "+kata.charAt(3)+ kata.charAt(2)+kata.charAt(1)+kata.charAt(0);
        System.out.println("Reverse: "+reverse);
    }
}
