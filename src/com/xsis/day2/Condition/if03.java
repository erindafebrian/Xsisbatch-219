package com.xsis.day2.Condition;

import java.util.Scanner;

public class if03 {
    public static void main(String[] args) {
        int days, month;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Bulan : ");
        month = scan.nextInt();
        if (month == 2)  {
            days = 28;
        } else if (month == 4 || month == 6 || month==9 || month==11) {
            days = 30;
        } else {
            days = 31;
        }

        System.out.println("Days in month : " + month + "has" +days +"days");
    }
}
