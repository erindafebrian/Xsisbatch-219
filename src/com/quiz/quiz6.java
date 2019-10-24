package com.quiz;

import java.util.Scanner;

public class quiz6 {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Weight : ");
        weight = scan.nextDouble();
        System.out.println("height : ");
        height = scan.nextDouble();
        bmi = (height/(weight*weight));
        System.out.println("Nilai BMI : "+bmi);
    }
}
