package com.Ivycomptech.DuckAssignment;

public interface Swimable {

    default void swim() {
        System.out.println("duck can swim");

    }

}
