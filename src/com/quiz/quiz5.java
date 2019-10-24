package com.quiz;

import java.util.Scanner;

public class quiz5 {

        public static void main(String[] args) {
            double farenheit, celcius, pengali=0.56, pengurang= 32;
            Scanner scan = new Scanner(System.in);
            System.out.println("farenheit : ");
            farenheit = scan.nextDouble();
            celcius = (farenheit - pengurang) * pengali;
            System.out.println("Celcius : " +celcius);
    }
}
