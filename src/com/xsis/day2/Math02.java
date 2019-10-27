package com.xsis.day2;

import java.util.Scanner;

public class Math02 {
    public static void main(String[] args) {
        double s,a,t;
        Scanner scan=new Scanner(System.in);
        System.out.println("Jarak : ");
        s=scan.nextDouble();

        System.out.println("Percepatan : ");
        a=scan.nextDouble();

        t= Math.sqrt(2*s/a);

        System.out.println("Waktu yang ditempuh mobil : " +t);

        //pembulatan ke atas , jika >0.5 return value dibulatkan ke 1
        System.out.println("Waktu yang di tempuh hasil pembulatan : "+Math.round(t));

        // dibulatkan kebawah jika >0.5 return value 0.5
        System.out.println("Waktu yang ditempuh mobil : "+Math.floor(t));

    }
}
