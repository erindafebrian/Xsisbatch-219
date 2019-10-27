package com.dini;

import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        int bil1, bil2, bil3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang hipotenusa: ");
        bil1 = scan.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = scan.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = scan.nextInt();
        if(bil1<(bil2+bil3)){
            System.out.println("bilangan yang anda maukkan memungkinkan panjang - panjang segitiga");
        } else {
            System.out.println("bilangan yang anda masukkan tidak memungkinkan menjadi panjang - panjang segitiga");
        }
    }
}
