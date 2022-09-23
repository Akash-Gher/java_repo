package com.javaAssessment.javaAssessment;

import java.util.Scanner;

/*

given an array nums with n objects colored red ,white,or blue sort them in-place so that objects of
the same color are adjacent with the colors in the order red white and blue.

we will use the 0 1 2 to represent the color red whilte blue respectively.

you must sole the probem without using sort function

Example Input:  nums=[2,0,2,1,1,0]
        output=[0,0,1,1,2,2]
        Input:  nums=[2,0,1]
        output=[0,1,2]

 */
public class sortColors {



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int size=sc.nextInt();

                int [] arr=new int[size];
        System.out.println("Enter array elements 0 ,1,or 2 :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //bubble sort method to sort colors
        for(int i=0; i < size; i++){
            for(int j=1; j < (size-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                   int  temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //printing array
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
