package com.Ivycomptech.StringsAssignments;

public class String_problem_4 {

    /*
    4. Write a Java program to compare a given string to another string, ignoring case considerations.
Sample Output:
"Stephen Edwin King" equals "Walter Winchell"? false
"Stephen Edwin King" equals "stephen edwin king"? true
     */
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String str2 = "stephen edwin king";



        boolean equals = str1.equalsIgnoreCase(str2);


        System.out.println(equals);

    }
}
