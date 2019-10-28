package com.dini;

import java.util.Scanner;

public class pr18 {
    public static void main(String[] args) {
        int cd, poin;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah cd yang kamu miliki: ");
        cd = scan.nextInt();
        if (cd==1){
          poin = 3;
        }
        else if(cd==2){
          poin=10;
        }
        else  if(cd==3){
            poin=20;
        }
        else if(cd>=4){
            poin=45;
        }
        else {
            poin=0;
        }
        System.out.println("Poin kamu adalah: "+poin);
    }
}
