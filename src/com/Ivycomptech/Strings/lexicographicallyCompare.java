package com.Ivycomptech.Strings;

public class lexicographicallyCompare {
    public static void main(String[] args) {
        String str1 = "string1", str2 = "string2";

        int retval = str1.compareTo(str2);

        if (retval == 0) {
            System.out.println("str1 and str2 are lexicographycally similer ");
        } else{
            System.out.println("str1 and str2 are not  lexicographycally similer ");
        }

    }
}
