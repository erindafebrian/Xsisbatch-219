package com.dini;

import java.util.Scanner;

public class pr24 {
    static final double disc1 = .5, disc2 = .10, disc3 = .20;
    public static void main(String[] args) {
        double order, discount;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your total order: ");
        order=scan.nextInt();
        if(order>=30 && order<70){
            discount = order*disc1;
        } else if(order>=70 && order<150){
            discount = order*disc2;
        } else if(order>=150){
            discount = order*disc3;
        } else {
            discount = 0;
        }
        System.out.println("Your discount is: "+discount);
    }
}
