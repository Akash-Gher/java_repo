package com.Ivycomptech.ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Unmodifiable {


    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);



        for (int i:list        ) {
            System.out.println(i);

        }
        List<Integer> list2 = Collections.unmodifiableList(list);
        list2.add(4);
        for (int i:list2       ) {
            System.out.println(i);

        }
    }
}
