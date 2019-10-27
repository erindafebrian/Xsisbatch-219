package com.xsis.day2.string;

import com.sun.javaws.progress.PreloaderPostEventListener;

public class String06 {
    public static void main(String[] args) {
        String s;
        int n;
        s= "Hello Java Programmer";
        System.out.println(s);
        System.out.println("Length : "+s.length() );

        System.out.println("Index ke-1 : " +s.indexOf("Hello"));
        System.out.println("Index ke-2 : "+s.indexOf("Java"));
        System.out.println("Index ke-3 : " + s.indexOf("Programmer"));

        System.out.println("Kata yang jadi : "+s.substring(11,21) +" "+s.substring(0,5)+" "+s.substring(6,10));








    }
}
