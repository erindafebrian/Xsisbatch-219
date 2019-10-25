package com.xsis;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        int bilangan, digit1, digit2, digit3,digit4, sisa, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("input bilangan : ");
        bilangan = scan.nextInt();

        digit1 = (int)bilangan / 1000;
        sisa = (int)bilangan % 1000;
        System.out.println("digit 1 : " +digit1 + " Sisa : " +sisa);

        digit2 = (int)sisa/100;
        sisa = (int) sisa % 100;
        System.out.println("digit 2 : " +digit2 + " Sisa : " +sisa);

        digit3 =  (int) sisa / 10;
        sisa= (int) sisa %10;
        System.out.println("digit3 : " +digit3 + " Sisa : " +sisa);

        digit4 =  (int) sisa;
        sisa= (int) sisa %1;
        System.out.println("digit3 : " +digit4 + " Sisa : " +sisa);

        total = digit1+digit2+digit3+digit4;
        System.out.println("Total modulus : " +total);
    }
}
