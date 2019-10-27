package com.homework.pr02;

import java.util.Scanner;

public class nomor18 {
    public static void main(String[] args) {
        int purchases;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of CDs that purchased in a month :");
        purchases = scan.nextInt();

        if (purchases>0 &&  purchases<2){
            System.out.println("You are awarded 3 points");
        }else if (purchases>1 && purchases<3 ) {
            System.out.println("You are awarded 10 points");
        }else if (purchases>2 && purchases<4){
            System.out.println("You are awarded 20 points");
        }else if (purchases>=4){
            System.out.println("You are awarded 45 points");
        }else {
            System.out.println("you are not awarded");
        }
    }
}
