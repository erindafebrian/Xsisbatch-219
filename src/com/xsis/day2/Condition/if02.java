package com.xsis.day2.Condition;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("input bilangan : ");
        n=scan.nextInt();

        if (n%2==0) {
            System.out.println("genap");
        } else {
            System.out.println("gsnjil");
        }
    }
}
