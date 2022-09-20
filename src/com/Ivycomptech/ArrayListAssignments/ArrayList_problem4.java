package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem4 {
    /*
4. Retrieve an element (at a specified index) from a given array list.
     */

    public static void main(String[] args) {

        List<String> clist=new ArrayList<>();

        clist.add("red");
        clist.add("pink");
        clist.add("blue");
        clist.add("yellow");
        clist.add("green");

        String element = clist.get(0);
        System.out.println("First element: "+element);
    }
}
