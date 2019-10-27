package com.dini;

import java.util.Scanner;

public class pr08 {
    public static void main(String[] args) {
        int jump1, jump2, jump3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first jump: ");
        jump1 = scan.nextInt();
        System.out.println("Enter second jump: ");
        jump2 = scan.nextInt();
        System.out.println("Enter third jump: ");
        jump3 = scan.nextInt();
        if ((jump1+jump2+jump3)/3 >= 8){
            System.out.println("Berkualitas");
        } else {
            System.out.println("Diskualifikasi");
        }
    }
}
