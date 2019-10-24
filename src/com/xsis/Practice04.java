package com.xsis;
/* rumus luas lingkaran
* area = pi*(r*r)
* pi = 3.14
*  */
import java.util.Scanner;

public class Practice04 {
    //deklarsi pi menjadi sttic agar bisa diakses main method
    static final double pi = 3.14;

    public static void main(String[] args) {
       double area, radius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Raadius : ");
        radius = scan.nextDouble();
        //menghitungb areanya
        area = pi * (radius*radius);
        System.out.println("Luas Lingkaran : "+area);

    }
}
