package com.dini;

import java.util.Scanner;

public class pr23 {
    public static void main(String[] args) {
        int w1, w2, w3, heavist;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the weight of first person");
        w1 = scan.nextInt();
        System.out.print("Enter the weight of second person");
        w2 = scan.nextInt();
        System.out.print("Enter the weight of third person");
        w3 = scan.nextInt();
        if(w1 > w2 && w1 > w3){
            heavist = w1;
        } else if (w2 > w1 && w2 > w3){
            heavist = w2;
        } else {
            heavist = w3;
        }
        System.out.println("The weight of heavist person is: "+heavist);
    }
}
