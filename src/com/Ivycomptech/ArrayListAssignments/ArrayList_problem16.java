package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem16 {
    /*
16. Clone an array list to another array list.
     */
    public static void main(String[] args) {
        List<String> clist=new ArrayList<>();

        clist.add("red");
        clist.add("pink");
        clist.add("blue");
        clist.add("yellow");
        clist.add("green");

        System.out.println("Original array list: " + clist);
        ArrayList<String> enlist = (ArrayList<String>) ((ArrayList<String>) clist).clone();
        System.out.println("Cloned array list: " + enlist);
    }
}

