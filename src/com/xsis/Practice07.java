package com.xsis;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        double itemBeforeDiscount, Discount, itemAfterDiscount, pajak, itemfinal;
        Scanner scan =new Scanner(System.in);
        System.out.print("Harga Item Barang : ");
        itemBeforeDiscount = scan.nextDouble();
        System.out.print("Diskon % : ");
        Discount = scan.nextDouble();
        itemAfterDiscount = itemBeforeDiscount - (itemBeforeDiscount*Discount/100);
        System.out.println("Item After Discount : " + itemAfterDiscount);
        System.out.println("Pajak : ");
        pajak = scan.nextDouble();
        itemfinal = itemAfterDiscount + (itemAfterDiscount*pajak/100);
        System.out.println("Harga Item final : " +itemfinal);
    }
}
