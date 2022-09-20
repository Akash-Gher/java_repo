package com.Ivycomptech.DoraAssignment;

import java.util.Scanner;

public class Dora_problem {


    public static void main(String[] args) {
       /* Input consists of 3 integers
        The first input denotes the number of rows
        The second input denotes the number of columns
        The third input denotes the tree number, which you have to find whether it's a mango tree or not.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive row number , column number and tree Number :");

        int m= sc.nextInt();
        int n= sc.nextInt();
        int tn= sc.nextInt();

        if(tn<n||tn%n==0||(tn%n==1))

        {

            System.out.println("Yes");

        }

        else

        {

            System.out.println("No");

        }
    }
}
