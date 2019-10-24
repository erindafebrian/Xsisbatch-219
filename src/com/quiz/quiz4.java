package com.quiz;

import sun.plugin2.main.server.JVMInstance;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class quiz4 {
    static final double u0=0;
    public static void main(String[] args) {
        double percepatan, waktu, jarak;
        Scanner scan = new Scanner(System.in);
        System.out.println("Percepatan : ");
        percepatan = scan.nextDouble();
        System.out.printf("Waktu : ");
        waktu = scan.nextDouble();
        jarak = u0 + 0.5 * percepatan*waktu*waktu;
        System.out.println(" Jarak : " +jarak);
    }
}
