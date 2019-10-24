package com.xsis;


import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First Name : ");
        String firstName=scan.nextLine();
        System.out.print("Last Name : ");
        String lastName= scan.nextLine();
        System.out.println("FullName : "+firstName +lastName);
    }
}
