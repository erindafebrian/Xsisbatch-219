package com.homework.pr02;

import java.util.Scanner;

public class nomor23 {
    public static void main(String[] args) {
        int w1, w2, w3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the first weight : ");
        w1 = scan.nextInt();
        System.out.println("Insert the second weight : ");
        w2 = scan.nextInt();
        System.out.println("Insert the third weight : ");
        w3 = scan.nextInt();

        if (w1 > w2 && w1 > w3){
            System.out.println("The weight of heaviest person is: " + w1);
        } else if (w2 >w1 && w2 >w3){
            System.out.println("The weight of heaviest person is: " + w2);
        } else  {
            System.out.println("The weight of heaviest person is : " + w3);
        }
    }
}
