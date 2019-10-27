package com.dini;

import java.util.Scanner;

public class pr01 {
    public static void main(String[] args) {
        int numb;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        numb = scan.nextInt();
        if(numb%6==0){
            System.out.println("biangan yang anda masukkan habis dibagi 6");
        } else{
            System.out.println("bilangan yang anda masukkan tidak habis dibagi 6");
        }
    }
}
