package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem5 {

    /*
5. Update specific array element by given element.
     */

    public static void main(String[] args) {

        List<String> clist=new ArrayList<>();

        clist.add("red");
        clist.add("pink");
        clist.add("blue");
        clist.add("yellow");
        clist.add("green");

        System.out.println(clist);

        // Update the third element with "orange"
        clist.set(2, "orange");
        System.out.println(clist);
    }
}
