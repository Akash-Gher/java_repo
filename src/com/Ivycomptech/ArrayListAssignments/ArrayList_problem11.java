package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_problem11 {
    /*
    11. Reverse elements in an array list.
     */
    public static void main(String[] args) {

        List<String> clist=new ArrayList<>();

        clist.add("red");
        clist.add("pink");
        clist.add("blue");
        clist.add("yellow");
        clist.add("green");


        System.out.println("List before reversing :\n" + clist);
        Collections.reverse(clist);
        System.out.println("List after reversing :\n" + clist);
    }
}
