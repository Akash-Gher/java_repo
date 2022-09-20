package com.Ivycomptech.Stack;

import java.util.Stack;
import java.util.Vector;

public class Stack_Implementations extends Vector {
    public static void main(String[] args) {
        System.out.println("Stack implementation ");

        Stack<String> myStack= new Stack<>();

        myStack.push("String 1");
        myStack.push("String 2");
        myStack.push("String 3");
        myStack.push("String 4");

        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);


    }
}
