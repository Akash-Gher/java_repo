package com.Ivycomptech.StringsAssignments;

public class String_problem_3 {

    /*
    problem statement:
    3. Write a Java program to check whether two String objects contain the same data.
Sample output:
"Stephen Edwin King" equals "Walter Winchell"? false
"Stephen Edwin King" equals "Mike Royko"? false
     */
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Stephen Edwin King";

         boolean equals = str1.equals(str2);

        System.out.println(equals);

    }

}
