package com.Ivycomptech.DuckAssignment;

public class RubberDuck extends Duck_Inheritance_Assignment implements Sqeezaable{

    Sqeezaable sqeezaable=new Sqeezaable() {
        @Override
        public void sqeez() {
            Sqeezaable.super.sqeez();
        }
    };

}
