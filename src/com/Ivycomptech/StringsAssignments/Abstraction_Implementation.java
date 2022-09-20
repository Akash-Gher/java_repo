package com.Ivycomptech.StringsAssignments;

import java.io.*;
public class Abstraction_Implementation {

    /*
    common functionality
-open file
- read file
- abstract method  produce report()
- send via email/slack

     */


    public static void main(String[] args) throws IOException {
        File file = new File( "C:\\Users\\Akash\\IdeaProjects\\Demo\\src\\test.txt");
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);



    }
}
