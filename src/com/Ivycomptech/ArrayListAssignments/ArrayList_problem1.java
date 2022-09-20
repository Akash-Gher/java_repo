package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem1 {

    /*
    Create an ArrayList of your favorite colors and do the following,

1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

     */


    public static void main(String[] args) {


       List<String> clist=new ArrayList<>();

       clist.add("red");
       clist.add("pink");
       clist.add("blue");
       clist.add("yellow");
       clist.add("green");

        System.out.println(clist);




    }
}
