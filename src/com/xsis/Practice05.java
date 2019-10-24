package com.xsis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        double literPerKilo, totalJarakTempuh, totalLiter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Total Jarak Tempuh : ");
        totalJarakTempuh = scan.nextDouble();
        System.out.println("Total Bensin yang dipakai : ");
        totalLiter = scan.nextDouble();
        //menghitung satu liter per kilo
        literPerKilo = totalJarakTempuh / totalLiter;
        System.out.println("Satu liter per kilo : " + literPerKilo);
    }
}
