package com.Ivycomptech.ClassesandObject;

public class HolidayAssignment {


/*    1) The Java class called Holiday is started below. An object of class Holiday
represents a holiday during the year. This class has three instance variables:
 • name, which is a String representing the name of the holiday
 • day, which is an int representing the day of the month of the holiday
 • month, which is a String representing the month the holiday is in*/

public class Holiday {
 private String name;
 private int day;
 private String month;
 // your code goes here
    /* a) Write a constructor for the class Holiday, which takes a String representing the
name, an int representing the day, and a String representing the month as its
arguments, and sets the class variables to these values.
An answer:*/

    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }

   /* b) Write a method inSameMonth, which compares two instances of the class
    Holiday, and returns the Boolean value true if they have the same month, and
false if they do not.*/

    public boolean inSameMonth(HolidayAssignment.Holiday hol){
        return this.month.equals(hol.month);

            }

/*
    c) Write a method avgDate which takes an array of base type Holiday as its
    argument, and returns a double that is the average of the day variables in the
    Holiday instances in the array. You may assume that the array is full (i.e. does not
have any null entries).*/

    public static double avgDate(Holiday[] hol) {
        int sum = 0;
        for(int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum)/hol.length;
    }

  /*  d) Write a piece of code that creates a Holiday instance with the name “Independence
    Day”, with the day “4”, and with the month “July”.
 */
    Holiday hol = new Holiday("Independence_Day", 4, "July");
}

}
