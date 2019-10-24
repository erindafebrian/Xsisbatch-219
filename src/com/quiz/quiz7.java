package com.quiz;

import java.sql.Statement;
import java.util.Scanner;

public class quiz7 {
    static final double pajak = .2;
    public static void main(String[] args) {
        double barang1, barang2, barang3, barang1SetelahPajak, barang2SetelahPajak, barang3SetelahPajak, harga3SetelahPajak;
        double total, totalSetelahPajak,meanSebelum, meanSesudah;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga Barang 1 :");
        barang1 = scan.nextDouble();
        System.out.println("Harga Barang 2 : ");
        barang2 = scan.nextDouble();
        System.out.println("Harga Barang 3 : ");
        barang3 = scan.nextDouble();
        total= barang1 + barang2 + barang3;
        System.out.println("Harga barang sebelum kena pajak : " + total);
        barang1SetelahPajak = barang1+(barang1*pajak);
        System.out.println("Barang 1 setelah pajak : " +barang1SetelahPajak);
        barang2SetelahPajak = barang2 + (barang2*pajak);
        System.out.println("Barang 2 setelah pajak : " + barang2SetelahPajak);
        barang3SetelahPajak = barang3 + (barang3*pajak);
        System.out.println("Barang 3 setelah pajak : " + barang3SetelahPajak);
        totalSetelahPajak = barang1SetelahPajak+barang2SetelahPajak+barang3SetelahPajak;
        System.out.println("Total harga setelah terkena pajak masing masing 20 persen : " + totalSetelahPajak);
        meanSebelum = total /3 ;
        System.out.println("Rata Harga Sebelum Pajak : " + meanSebelum);
        meanSesudah = totalSetelahPajak /3;
        System.out.println("Rata harga setelah pajak : " + meanSesudah);

    }
}
