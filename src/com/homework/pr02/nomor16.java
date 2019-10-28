package com.homework.pr02;

import java.util.Scanner;

public class nomor16 {
    public static void main(String[] args) {
        char letter;
        Scanner scan= new Scanner(System.in);
        System.out.println("Input a letter between A-F : ");
        letter=scan.next().charAt(0);

        if (letter=='A'){
            System.out.println("The Precentage is 90-100");
        } else if (letter=='B'){
            System.out.println("The Precentage is 80-89");
        }else if (letter=='C') {
            System.out.println("The Precentage is 70-79");
        }else if (letter=='D') {
            System.out.println("The Precentage is 60-69");
        }else if (letter=='E') {
            System.out.println("The Precentage is 0-59");
        } else {
            System.out.println("The Precentage is 0-59");
        }
    }
}
