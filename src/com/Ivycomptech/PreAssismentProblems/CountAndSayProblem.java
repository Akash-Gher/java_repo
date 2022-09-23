package com.Ivycomptech.PreAssismentProblems;

/*

4. The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.
For example, the saying and conversion for digit string "3322251":

Given a positive integer n, return the nth term of the count-and-say sequence.
Example 1:
Input: n = 1
Output: "1"
Explanation: This is the base case.

Example 2:
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"


 */
import java.lang.String;
import java.util.Scanner;

public class CountAndSayProblem {

    public static String countAndSay(int n){

        if(n==1)    return "1";
        String s=countAndSay(n-1);//recursive

        String output="";
        int counter=0;

        for(int i=0;i<s.length();i++){
            counter++;
            //combining groups
            if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                output=output+counter+s.charAt(i);
                counter=0;
            }
        }

        return output;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit String:");
        int n=sc.nextInt();


        System.out.println(countAndSay(n));


    }
}
