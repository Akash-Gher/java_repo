package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem2 {

    /*
    2. Iiterate through all elements in an array list.
     */

    public static void main(String[] args) {
        List<String> clist=new ArrayList<>();

        clist.add("red");
        clist.add("pink");
        clist.add("blue");
        clist.add("yellow");
        clist.add("green");

        for (String element : clist) {
            System.out.println(element);
        }

    }
}
