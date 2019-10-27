package com.dini;

import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        int numb;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        numb = scan.nextInt();
        if(numb>=1000 && numb<=9999){
            System.out.println("your number is 4 digits");
        }else {
            System.out.println("your number is not 4 digits");
        }
    }
}
