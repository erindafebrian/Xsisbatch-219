package com.homework.pr02;

import java.util.Scanner;

public class nomor19 {
    public static void main(String[] args) {
        double length1, length2, length3;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the longest length : ");
        length1=scan.nextInt();
        System.out.println("Enter the second length : ");
        length2=scan.nextInt();
        System.out.println("Enter the third length : ");
        length3 = scan.nextInt();

        if (length1==length2 && length2==length3){
            System.out.println("It is an equilateral triangle");
        } else if (length3 == Math.sqrt(Math.pow(length1,2) - Math.pow(length2,2)) &&
                length2 == Math.sqrt(Math.pow(length1,2) - Math.pow(length3,2)) &&
                length1== Math.sqrt(Math.pow(length2,2) + Math.pow(length3,2))) {
            System.out.println("That is the the right triangle");
        } else if(length1<(length2+length3)){
            System.out.println("It is Not special triangle");
        } else {
            System.out.println("It is not both of equilateral, right, ang not special triangle");
        }
    }
}
