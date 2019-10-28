package com.dini;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class pr15 {
    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";
    public static void main(String[] args) {
       String number, satuan="", decimal="";
       int a, b;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the number: ");
        number = scan.next();
        if (number.matches(IS_NUMERIC)){
             a = number.charAt(0);
             b = number.charAt(2);
            switch (a){
                case  '1':
                    satuan = "satu";
                    break;
                case '2':
                    satuan = "dua";
                    break;
                case '3':
                    satuan = "tiga";
                    break;
                case '4':
                    satuan = "empat";
                    break;
                default:
                    break;
            }
            switch (b){
                case '0':
                    decimal = "nol";
                    break;
                case '1':
                    decimal = "satu";
                    break;
                case '2':
                    decimal = "dua";
                    break;
                case '3':
                    decimal= "tiga";
                    break;
                case '4':
                    decimal="empat";
                    break;
                case '5':
                    decimal="lima";
                    break;
                case '6':
                    decimal="enam";
                    break;
                case '7':
                    decimal="tujuh";
                    break;
                case '8':
                    decimal="delapan";
                    break;
                case '9':
                    decimal="sembilan";
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("Inputan Bukan bilangan numeric");         
        }
        System.out.println(satuan+" point "+decimal);
        }
    }