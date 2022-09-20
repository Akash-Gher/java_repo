package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem12 {
    /*
12. Extract a portion of an array list.
     */
    public static void main(String[] args) {

        List<String> clist=new ArrayList<>();

        clist.add("red");
        clist.add("pink");
        clist.add("blue");
        clist.add("yellow");
        clist.add("green");

        System.out.println("Original list: " + clist);
        List<String> sub_List = clist.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);
    }
}
