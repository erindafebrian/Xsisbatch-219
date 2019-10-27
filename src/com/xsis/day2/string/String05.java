package com.xsis.day2.string;

public class String05 {
    public static void main(String[] args) {
        String s = "Hello Java Programmer";

        //search Java Index
        System.out.println("Index : "+s.indexOf("Java"));

        //substring untuk get sebuah string dari index ke -i s/d  yang ke-
        System.out.println("Substring : " + s.substring(6,10));
    }
}
