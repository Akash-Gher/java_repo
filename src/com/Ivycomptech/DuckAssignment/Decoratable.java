package com.Ivycomptech.DuckAssignment;

public interface Decoratable {

    default void decorated() {
        System.out.println("duck can decorated");
    }
}
