package com.homework.pr02;

import java.util.Scanner;

public class nomor20 {
    public static void main(String[] args) {
        int pin=1234, pin1=1234, pin2=1234, uang, uang1, uang2, uang3, sisa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password : ");
        pin = scan.nextInt();
        if (pin==1234){
            System.out.println("Enter the money to withdraw : ");
            uang = scan.nextInt();
            uang1 = uang / 10;
            sisa = uang %10 ;

            uang2 = sisa / 5;
            sisa = sisa % 5 ;

            uang3 = sisa/1;
            sisa = sisa%1;
            System.out.println("Enter  amount of " + uang + " = " + uang1 + " notes $10 " + uang2 + " notes $5 " + uang3 +" note $1");
        } else {
            System.out.println("Enter the password again : ");
            pin1=scan.nextInt();

            if (pin1==1234) {
                System.out.println("Enter the money to withdraw : ");
                uang = scan.nextInt();
                uang1 = uang / 10;
                sisa = uang % 10;

                uang2 = sisa / 5;
                sisa = sisa % 5;

                uang3 = sisa / 1;
                sisa = sisa % 1;
                System.out.println("Enter  amount of " + uang + " = " + uang1 + " notes $10 " + uang2 + " notes $5 " + uang3 + " note $1");
            } else {
                System.out.println("Enter the password again : ");
                pin2 = scan.nextInt();

                if (pin2 == 1234) {
                    System.out.println("Enter the money to withdraw : ");
                    uang = scan.nextInt();
                    uang1 = uang / 10;
                    sisa = uang % 10;

                    uang2 = sisa / 5;
                    sisa = sisa % 5;

                    uang3 = sisa / 1;
                    sisa = sisa % 1;
                    System.out.println("Enter  amount of " + uang + " = " + uang1 + " notes $10 " + uang2 + " notes $5 " + uang3 + " note $1");
                } else {
                    System.out.println("PIN Terkunci");
                }
            }
        }

        }
    }
