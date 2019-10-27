package com.xsis.day2.QUIZ;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        String kalimat;
        int pjg;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kalimat : ");
        kalimat=scan.nextLine();
        pjg=kalimat.length();

        System.out.println("Panjang kalimat : " + pjg);

        if (pjg > 20) {
            System.out.println("Many Characters");
        }else {
            System.out.println("Short Character");
        }
    }
}
