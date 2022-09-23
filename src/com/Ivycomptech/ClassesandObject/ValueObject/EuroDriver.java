package com.Ivycomptech.ClassesandObject.ValueObject;


public class EuroDriver {


    public EuroDriver(int i) {

    }

    public static void main(String args[]) {

        Euro2 euro=new Euro2(10);
        Euro2 euro2=new Euro2(10);
      //  EuroDriver euro = new ( 10);

       // EuroDriver euro2 = new EuroDriver(  10);

        /* hashCode() generates true as the lengths of
           the name value of the two objects are same*/

        // Condition check using hashCode() method
        if (euro.hashCode() == euro2.hashCode())

            /* On entering equals() method, it checks for
               other values and hence, returns false */
            System.out.println(euro.equals(euro2));
        else
            System.out.println("Not equal");


    }
}