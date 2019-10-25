package com.homework;

import java.util.Scanner;

public class nomor6 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        int input, sisa, hasil,digit1, digit2, digit3, digit4;
        System.out.print("Enter The Number : ");
        input = scan.nextInt();

        digit1=input/20;
        sisa=input%20;

        digit2=sisa/10;
        sisa=sisa%10;

        digit3=sisa/5;
        sisa=sisa%5;

        digit4=sisa;
        sisa=sisa%1;

        System.out.println("The Result : "+digit1+" Note of $20"+digit2+" Note Of $10"+digit3+" Note Of $5" +digit4+" Note Of $1");
    }
}
