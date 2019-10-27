package com.dini;

import java.util.Scanner;

public class pr03 {
    public static void main(String[] args) {
        int numb, hasil, sisa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter yoour number: ");
        numb = scan.nextInt();
        if (numb%4==0){
            System.out.println("Bilangan yang anda masukkan habis dibagi 4");
        } else {
            System.out.println("Bilangan yang anda masukkan tidak habis dibagi 4");
        }
        hasil = numb/4;
        sisa = numb%4;
        System.out.println(numb + " = " + hasil +" x 4 + "+sisa);
    }
}
