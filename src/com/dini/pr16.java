package com.dini;

import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {
        char grade;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your grade: ");
        grade=scan.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Persentage 900 - 100 %");
                break;
            case 'B':
                System.out.println("Persentage 80 - 89 %");
                break;
            case 'C':
                System.out.println("70-79 %");
                break;
            case 'D':
                System.out.println("60 - 69 %");
                break;
            case 'E':
                System.out.println("50-59 %");
                break;
            case 'F':
                System.out.println("50-59%");
                break;
            default:
                break;
        }
    }
}
