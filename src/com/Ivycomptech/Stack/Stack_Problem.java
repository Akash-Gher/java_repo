package com.Ivycomptech.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Problem {
  /*
  A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
Given a string, determine if it is balanced or not.
Input Format
There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
The part of the code that handles input operation is already provided in the editor.
Output Format
For each case, print 'true' if the string is balanced, 'false' otherwise.
Sample Input
{}()
({()})
{}(
[]
Sample Output
true
true
false
true

   */
    public static boolean BalanceParentheses(String input,char opening, char closing){
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < input.length();i++){
            char c = input.charAt(i);
            if(c == closing){
                if(!stack.empty()){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if(c == opening){
                stack.push(String.valueOf(c));
            }
        }
        return stack.empty();
    }


   //stack problem
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // String input = "([{}])";
        System.out.println("Enter character input string:");
        String input=sc.nextLine();


        if (BalanceParentheses(input,'(',')'))
            System.out.println("true ");
        else
            System.out.println("false");

    }
}
