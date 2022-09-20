package com.Ivycomptech.PolymorphismThroughMultiLevelInheritance;

public class MultiLevelInheritanceDriver {
 /*
 Grandfather(swims in well) Father(swims in river)Son(swims in pool)
 try to demo using multilevel inheritance

  */
    public static void main(String[] args) {

        Grandfather grandfather=new Grandfather();
        Grandfather father=new Father();
        Grandfather son=new Son();

        grandfather.canSwim();
        father.canSwim();
        son.canSwim();

    }
}
