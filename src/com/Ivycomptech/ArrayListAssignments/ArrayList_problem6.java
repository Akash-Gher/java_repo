package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem6 {
    /*
6. Remove the third element from an array list.
     */

    public static void main(String[] args) {

        List<String> clist=new ArrayList<>();

        clist.add("red");
        clist.add("pink");
        clist.add("blue");
        clist.add("yellow");
        clist.add("green");

        System.out.println(clist);
        clist.remove(2);
        System.out.println(clist);
    }
}
