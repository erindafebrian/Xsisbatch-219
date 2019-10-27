package com.homework.pr02;

import java.util.Scanner;

public class nomor26 {
    static final double usd1 = .1, usd2=.25, usd3= .4, usd4=.6;
    public static void main(String[] args) {
        int kwh;
        double pay;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Kilowatt-hours have consumed: ");
        kwh = scan.nextInt();

        if (kwh<=500){
            pay = usd1*kwh;
        } else if (kwh>=501 && kwh <=2000){
            pay = usd2*kwh;
        } else if (kwh>=2001 && kwh<=4000) {
            pay = usd3*kwh;
        } else {
            pay = usd4*kwh;
        }
        System.out.println("Total amount to pay: "+ pay +" USD");
    }
}
