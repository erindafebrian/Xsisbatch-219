package com.dini;

import java.util.Scanner;

public class pr17 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args) {
        String quantityStr;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input bilangan : ");
        quantityStr = scan.next();
        if (quantityStr.matches(IS_NUMERIC)){
            System.out.println("Inputan Bilangan Numeric");
        }else{
            System.out.println("Inputan Bukan bilangan numeric");
        }
    }
}
