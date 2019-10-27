package com.xsis.day2.string;

public class String04 {
    public static void main(String[] args) {
        String s, st;
        s = "Hello .NET Welcome to Xsis Academy";
        System.out.println(s);

        st=s.replace(".NET", "JAVA");
        System.out.println("Replace 01 : "+st);

        st=st.replace("Welcome","Hello").toLowerCase();
        System.out.println("Relace 02 : "+st);

        st=s.replace("Hello","Hay")
                .replace(".NET" , "JAVA")
                .replace("Hello" , "Welcome")
                .replace("Xsis", "Lala").toUpperCase();
        System.out.println("Replace  03 : "+st);

    }
}
