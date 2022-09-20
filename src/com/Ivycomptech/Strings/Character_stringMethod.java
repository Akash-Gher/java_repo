package com.Ivycomptech.Strings;

import java.util.Scanner;

public class Character_stringMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Enter a index:");
        int x=sc.nextInt();
        System.out.println("character at given index is hi"+str.charAt(x));
    }
}
