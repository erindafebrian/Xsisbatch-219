package com.quiz;

import java.util.Scanner;

public class quiz3 {
    static final double pajak = .07;
    static final double tips = .1;
    public static void main(String[] args) {
    double harga,hargaAfterAll;
        Scanner scan = new Scanner(System.in);
        System.out.println("harga barang : ");
        harga = scan.nextDouble();
        hargaAfterAll= harga + (harga*pajak) + (harga*tips) ;
        System.out.println("harga setelah pajak : " +hargaAfterAll);

    }
}
