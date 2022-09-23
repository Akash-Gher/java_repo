package com.Ivycomptech.DuckAssignment;

public class WoodenDuck extends Duck_Inheritance_Assignment implements  Decoratable{

  Decoratable decoratable=new Decoratable() {
      @Override
      public void decorated() {
          Decoratable.super.decorated();
      }
  };


}
