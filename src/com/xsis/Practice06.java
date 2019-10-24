package com.xsis;

import java.util.Scanner;

public class Practice06 {
    static final double pajak = .15;
    public static void main(String[] args) {
        double itemBeforeTax, itemAfterTax;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga barang sebelum pajak : ");
        itemBeforeTax = scan.nextDouble();
        itemAfterTax = itemBeforeTax + (itemBeforeTax * pajak);
        System.out.println("Harga barang setelah pajak : " + itemAfterTax);
    }
}
