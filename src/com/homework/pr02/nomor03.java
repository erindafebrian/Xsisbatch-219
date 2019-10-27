package com.homework.pr02;

import com.sun.media.sound.MidiOutDeviceProvider;

import java.util.Scanner;

public class nomor03 {
    public static void main(String[] args) {
        int angka, mod, bagi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        angka  = scan.nextInt();
        mod = angka%4;
        bagi = angka/4;

        if (mod == 0) {
            System.out.println("The number is multiple of four");
            System.out.println("The message is : 4 x " + bagi + " = " + angka);
        } else {
            System.out.println("The number is not multiple of four");
            System.out.println("The message is : 4 x " + bagi + " + " + mod + "="+angka);
        }

    }
}
