package PreAssismentProblems;

import java.util.Scanner;
import java.util.Stack;

/*
Take an input string with X opening brackets [ and Y closing brackets ], in a random order. Determine if the generated string of brackets is balanced, that is it consists of pairs of opening/closing brackets in the correct order with no matched opening and closing pairs. The kata has been structured to be simple, yet loosely guided. You will need to make decisions just like you were writing code for production. The examples are not meant to guide your implementation, they are there merely to give examples. Do not worry about input other than brackets and empty string.
Examples
(empty) “” [] OK
[][] OK
[[]] OK [[[][]]]
OK ][ FAIL
][][ FAIL
[][]][ FAIL
Hint: Start off returning string.empty as the default condition. This will allow you properly work the red-green-refactor cycle

RandomBracketsProblem
 */
import java.util.Stack;

import java.util.*;

public class RandomBracketsProblem {

    public static boolean balancedParenthesis(String str) {
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) return false;
            char check;
            switch (x) {
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case '}':
                    check = (char) stack.pop();
                    if (check == '(' || check == '[') return false;
                    break;
                case ']':
                    check = (char) stack.pop();
                    if (check == '(' || check == '{') return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public  static void main(String[] args) {
        String str = "[]";
        if (balancedParenthesis(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
}