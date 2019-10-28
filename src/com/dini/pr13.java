package com.dini;

import java.util.Scanner;

public class pr13 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args) {
        int a;
        String number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer : ");
        number = scan.next();
        if (number.matches(IS_NUMERIC)){
            a = number.length();
            System.out.println("You entered a "+a+" digit");
        }else{
            System.out.println("Inputan Bukan bilangan numeric");
        }
    }
}
