package com.Ivycomptech.ClassesandObject.ValueObject.Valueobjectassignment2;

// Class 1
class Euro2 {
    // Attributes of objects of class

    int value;


    // Constructor
    Euro2(int value)
    {

        this.value = value;

    }

    // Overriding using hashCode() method
    @Override public int hashCode()
    {
        /* overriding hashCode() method
        to check the length of the names */
        return this.value% 10;
    }

    // Boolean function to check
    @Override public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null
                || this.getClass() != obj.getClass())
            return false;
        Euro2 p1 = (Euro2)obj;

        return   this.value == p1.value;
    }
}