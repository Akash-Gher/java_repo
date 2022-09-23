package com.Ivycomptech.DuckAssignment;

public interface Flyable {
    default void fly() {
        System.out.println("duck can fly");

    }
}
