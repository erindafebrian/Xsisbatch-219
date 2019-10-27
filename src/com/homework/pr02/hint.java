package com.homework.pr02;

import java.util.Scanner;

public class hint {
    static final String  IS_NUMERIC = "7*8";

    public static void main(String[] args) {
        String quantityStr ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input bilangan: ");
        quantityStr=scan.next();

        if (quantityStr.matches(IS_NUMERIC)){
            System.out.println("Inputan Bilangan Numeric");
        }else{
            System.out.println("Inputan Bukan bilangan numeric");
        }
    }
}
