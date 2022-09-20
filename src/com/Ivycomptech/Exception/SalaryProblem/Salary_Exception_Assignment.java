package com.Ivycomptech.Exception.SalaryProblem;

import java.util.Scanner;

public class Salary_Exception_Assignment {
/*
problem statement:Average Salary Excluding the Minimum and Maximum Salary
You are given an array of unique integers' salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
Example 1:
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
Constraints:
•	3 <= salary.length <= 100
•	1000 <= salary[i] <= 106
•	All the integers of salary are unique.
 */


    //method to Calculate average salary
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE ;
        double s = 0.0;
        for (int j : salary) {
            min = Math.min(min, j);
            max = Math.max(max, j);
            s += j;
        }

        return (s - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {

        Salary_Exception_Assignment sea=new Salary_Exception_Assignment();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary length:");
         int sl=sc.nextInt();
        int [] arr= new int[sl];


         try{
             if(sl<3||sl>100)
                 throw new SalaryElementException("");

         }catch (SalaryElementException mse) {
             System.out.println("salary elements cant be less than 3 or more than 100");
         }


        try {
                  for (int i=0;i< arr.length;i++){
                         arr[i]=sc.nextInt();
                         if(arr[i]<1000||arr[i]>1000000)
                      throw new SalaryLimitException("");


                  }
            for (int i=0;i< arr.length;i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == (arr[j])) {
                        // got the duplicate
                        throw new Duplicate_Salary_Exception("");
                    }
                }
            }
            System.out.println(sea.average(arr));
        } catch (SalaryLimitException see) {
            System.out.println("Exception:Each salary Element cant be less than 1000 or more than 10 lack");
        }
        catch (Duplicate_Salary_Exception dse){
            System.out.println("Exception:salary Elements should be unique");
        }



    }

}
