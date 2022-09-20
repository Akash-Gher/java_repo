package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem7 {
/*
7. Search for an element in an array list.
 */
    public static void main(String[] args) {

        List<String> clist=new ArrayList<>();

        clist.add("Red");
        clist.add("Pink");
        clist.add("Blue");
        clist.add("Yellow");
        clist.add("Green");

        if (clist.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}
