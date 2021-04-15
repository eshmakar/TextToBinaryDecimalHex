package com.test;

import java.util.Scanner;

public class Main {
    private static void convert() {
        System.out.println("Введите слово: ");
        String s = new Scanner(System.in).nextLine();
        char[] ar = s.toCharArray();
        System.out.println(s);

        System.out.print("2 числ. = ");
        for (char c : ar) {
            System.out.print(Integer.toBinaryString(c) + " ");
        }
        System.out.println();

        System.out.print("10 числ. = ");
        for (char c : ar) {
            System.out.print(Character.hashCode(c) + " ");
        }
        System.out.println();

        System.out.print("16 числ. = ");
        for (char c : ar) {
            System.out.print(Integer.toHexString(c) + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        while (true)
            convert();
    }
}
