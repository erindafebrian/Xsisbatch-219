package com.dini;

import java.util.Scanner;

public class pr20 {
    public static void main(String[] args) {
        int pin, tarik, tarik1, tarik2, tarik3, sisa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        pin = scan.nextInt();
        if (pin==1234){
            System.out.print("Masukkan jumlah penarikan: ");
            tarik=scan.nextInt();
            tarik1 = tarik/10;
            sisa = tarik%10;
            tarik2 = sisa/5;
            sisa = sisa%5;
            tarik3 = sisa/1;
            sisa=sisa%1;
            System.out.println(tarik1+" $10 "+tarik2+" $5 "+tarik3+" $1");
        } else {
            System.out.print("Invalid PIN. Enter your PIN: ");
            pin = scan.nextInt();
            if (pin==1234){
                System.out.print("Masukkan jumlah penarikan: ");
                tarik=scan.nextInt();
                tarik1 = tarik/10;
                sisa = tarik%10;
                tarik2 = sisa/5;
                sisa = sisa%5;
                tarik3 = sisa/1;
                sisa=sisa%1;
                System.out.println(tarik1+" $10 "+tarik2+" $5 "+tarik3+" $1");
            }
            else {
                System.out.print("Invalid PIN. Enter your PIN: ");
                pin = scan.nextInt();
                if (pin==1234){
                    System.out.print("Masukkan jumlah penarikan: ");
                    tarik=scan.nextInt();
                    tarik1 = tarik/10;
                    sisa = tarik%10;
                    tarik2 = sisa/5;
                    sisa = sisa%5;
                    tarik3 = sisa/1;
                    sisa=sisa%1;
                    System.out.println(tarik1+" $10 "+tarik2+" $5 "+tarik3+" $1");
                }
                else {
                    System.out.println("Ups. Sorry");
                }
            }
        }
    }
}
