package com.dini;

import java.util.Scanner;

public class pr09 {
    static final int fee=200000;
    public static void main(String[] args) {
        int time, lembur, gaji, gajilembur;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jam kerja anda: ");
        time = scan.nextInt();
        if (time>40){
            gaji = 40*fee;
            lembur = time - 40;
            gajilembur = gaji + lembur*2*fee;
            System.out.println("Anda lembur selama: "+ lembur+ " jam");
            System.out.println("Jadi gaji anda adalah: "+gajilembur);
        } else {
            System.out.println("gaji anda adalah: "+time*fee);
        }
    }
}
