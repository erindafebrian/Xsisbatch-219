package com.homework.pr02;

import java.util.Scanner;

public class nomor12 {
    static final int u0 = 0;
    public static void main(String[] args) {
        int waktu, acc1, acc2, jarak1, jarak2, selisihJarak;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time (same both of t hem) : ");
        waktu = scan.nextInt();
        System.out.println("Enter the first car (A) acceleration : ");
        acc1 = scan.nextInt();
        System.out.println("Enter the second car (B) accceleration : ");
        acc2 = scan.nextInt();
        jarak1 = u0 + 12*acc1*waktu*waktu;
        jarak2 = u0 +12*acc2*waktu*waktu;
        if (acc1 > acc2){
            selisihJarak =  jarak1-jarak2;
            System.out.println("The distance is : " + selisihJarak + " and car A is first");
        } else {
            selisihJarak = jarak2 - jarak1;
            System.out.println("The distance is : " + selisihJarak + " and car B is first");
        }
    }
}
