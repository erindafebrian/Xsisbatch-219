package com.homework.pr02;

import java.util.Scanner;

public class nomor11 {
    public static void main(String[] args) {
        int jarak, sisaDekat, sisaJauh;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the miles traveled : ");
        jarak = scan.nextInt();
        sisaDekat = 6000-jarak;
        sisaJauh = 12000-jarak;
        if (jarak < 6000) {
            System.out.println("The type your next service is a minor service and you need : "
                    + sisaDekat + " miles more");
        }else if (jarak==6000) {
            System.out.println("The type your service is minor service");
        }else if (jarak > 6000 && jarak < 12000){
            System.out.println("The type your next service is a major service and you need : "
                    + sisaJauh + " miles more");
        }else if(jarak == 12000){
            System.out.println("The type your service is major service");
        }else{
            System.out.println("Please ask your next service to admin because you have passed the minor " +
                    "and major seervice");
        }
    }
}
