package com.homework;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        int input=32675 , sisa, digit1, digit2, digit3,digit4,digit5,hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("The Number : " +input);

        digit1=input/10000;
        sisa=input%10000;

        digit2=sisa/1000;
        sisa=sisa%1000;

        digit3=sisa/100;
        sisa=sisa%100;

        digit4=sisa/10;
        sisa=sisa%10;

        digit5=sisa;
        sisa=sisa%1;
        System.out.println("Display Result : "+digit5+digit4+digit3+digit2+digit1);


    }
}
