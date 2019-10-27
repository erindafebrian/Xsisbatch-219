package com.dini;

import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
        int numb;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        numb = scan.nextInt();
        if(numb%6==0 && numb%7==0) {
            System.out.println("Bilangan yang anda masukkan habis dibagi 6 dan 7");
        } else if (numb%6==0){
            System.out.println("Bilangan yang anda masukkan habis dibagi 6");
        } else if( numb%7==0){
            System.out.println("bilangan yang anda masukkan habis dibagi 7");
        }else {
            System.out.println("Bilangan yang anda masukkan tidak habis dibagi 6 atau 7");
        }
    }
}
