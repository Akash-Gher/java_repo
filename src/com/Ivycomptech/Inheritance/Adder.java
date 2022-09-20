package com.Ivycomptech.Inheritance;

class Adder  extends  Arithmetic{



    public static void main(String[] args) {

        Arithmetic arithmetic=new Arithmetic();
        System.out.println("My superclass is:"+arithmetic);
        System.out.println(arithmetic.add(10,5));
        System.out.println(arithmetic.add(15,5));
        System.out.println(arithmetic.add(10,25));
    }
}
