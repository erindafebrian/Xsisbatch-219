package com.dini;

import java.util.Scanner;

public class pr25 {
    static final double i1 = .01, i2 = .013, i3 = .015, i4 = .02, o1 = 10, o2 = 20, o3 = 50, o4 = 60;
    public static void main(String[] args) {
        double weight, payin, payout;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the weight: ");
        weight = scan.nextDouble();
        if(weight<1){
            payin = weight*i1;
            payout = weight*o1;
        } else if(weight<=1 && weight<2){
            payin= weight*i2;
            payout= weight*o2;
        } else if (weight<=2 && weight< 4){
            payin = weight*i3;
            payout = weight*o3;
        } else {
            payin = weight*i4;
            payout = weight*o4;
        }
        System.out.println("Your shipping inside the country is: "+payin+" outside the country is: "+payout);
    }
}
