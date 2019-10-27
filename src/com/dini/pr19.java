package com.dini;

import java.util.Scanner;

public class pr19 {
    public static void main(String[] args) {
        int sisi1, sisi2, sisi3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi1: ");
        sisi1=scan.nextInt();
        System.out.print("Masukkan panjang sisi2: ");
        sisi2=scan.nextInt();
        System.out.print("Masukkan panjang sisi3: ");
        sisi3=scan.nextInt();
        if(sisi1==sisi2 && sisi1==sisi3){
            System.out.println("Segitiga sama sisi");
        }
        else if(sisi3 == Math.sqrt(Math.pow(sisi1,2) + Math.pow(sisi2,2)) && sisi2== Math.sqrt(Math.pow(sisi3,2) - Math.pow(sisi1,2)) && sisi1 == Math.sqrt(Math.pow(sisi3,2) - Math.pow(sisi2,2))) {
            System.out.println("Segitiga siku - siku");
        }
        else if(sisi1<(sisi2+sisi3) && sisi2<(sisi1+sisi3) && sisi3<(sisi1+sisi2)){
            System.out.println("Segitiga sembarang");
        }
        else {
            System.out.println("Panjang yang anda masukkan salah");
        }
    }
}
