package com.dini;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        int bil1, bil2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = scan.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = scan.nextInt();
        if(bil1>bil2){
            System.out.println(bil1+" lebih besar dari "+bil2);
        } else {
            System.out.println(bil2+" lebih besar dari "+bil1);
        }
    }
}
