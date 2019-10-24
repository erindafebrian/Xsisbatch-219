package com.quiz;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class quiz9 {
    static final double pajak = .2;
    public static void main(String[] args) {
            double kwhawal,kwhakhir, totalKwh, tagihanpajak, tagihanKwh, totalbayar;
            Scanner scan = new Scanner(System.in);
            System.out.print("Nilai kwh awal bulan : ");
            kwhawal = scan.nextDouble();
            System.out.print("Nilai kWh akhir bulan : ");
            kwhakhir = scan.nextDouble();
            totalKwh = kwhakhir - kwhawal;
        System.out.println("Total kWh : " + totalKwh);
        System.out.println("---------------------------------------");
        tagihanKwh= totalKwh*15000;
        System.out.println("Harga Total per kWh: " + tagihanKwh);
        tagihanpajak= tagihanKwh+(tagihanKwh*pajak);
        System.out.println("Tagihan setelah pajak : "+ tagihanpajak);

    }
}
