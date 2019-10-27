package com.dini;

import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        int  distance, sisaRingan   ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your vehicle distance: ");
        distance = scan.nextInt();
        sisaRingan = distance - 6000;
        if(distance>=6000 && distance<12000){
            System.out.print("Your vehicle need small reparation");
        }
        else if(distance>=12000){
            System.out.print("Your vehicle need big reparation");
        }
        else {
            System.out.print("Your vehicle will nedd small reparation");
        }
    }
}
