package com.homework.pr02;

import java.util.Scanner;

public class nomor24 {
    static final double d1=.05, d2=.1, d3=.2;
    public static void main(String[] args) {
        double total, discount;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total amount order : ");
        total = scan.nextInt();

        if (total<30){
            System.out.println("Sorry there is no discount for your total amount order");
        } else if (total >= 30 && total < 70){
            discount = total*d1 ;
            System.out.println("Your discount is : " + discount);
        }else if (total >= 70 && total < 150){
            discount = total *d2;
            System.out.println("Your discount is : " + discount);
        }else  {
            discount = total *d3;
            System.out.println("Your discount is : " + discount);
        }
    }
}
