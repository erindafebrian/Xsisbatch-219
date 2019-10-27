package com.xsis.day2.string;

import java.util.Scanner;

public class Latihan01 {
    public static void main(String[] args) {
        String username, password,n1;
        double n2;
        Scanner scan= new Scanner(System.in);
        System.out.println("Input Username : ");
        username = scan.nextLine();

        n1=username.substring(0,4);
        password = n1;
        n2=200*Math.random();

        System.out.println("Password : "+password + Math.round(n2));

    }
}
