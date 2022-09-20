package com.Ivycomptech.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_problem17 {
    /*
        17. Empty an array list.
     */
    public static void main(String[] args) {
        List<String> colorList=new ArrayList<>();

        colorList.add("red");
        colorList.add("pink");
        colorList.add("blue");
        colorList.add("yellow");
        colorList.add("green");

        System.out.println("Original array list: " + colorList);
        colorList.removeAll(colorList);
        System.out.println("Array list after remove all elements "+colorList);
    }
}
