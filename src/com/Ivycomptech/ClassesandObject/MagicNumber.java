package com.Ivycomptech.ClassesandObject;

import java.util.Scanner;

public class MagicNumber {



// Returns true if mat[][] is magic

// square, else returns false.

    static boolean isMagicSquare(int mat[][],int N)

    {

        // calculate the sum of

        // the prime diagonal

        int sum = 0,sum2=0;

        for (int i = 0; i < N; i++)

            sum = sum + mat[i][i];

        // the secondary diagonal

        for (int i = 0; i < N; i++)

            sum2 = sum2 + mat[i][N-1-i];



        if(sum!=sum2)

            return false;



        // For sums of Rows

        for (int i = 0; i < N; i++) {



            int rowSum = 0;

            for (int j = 0; j < N; j++)

                rowSum += mat[i][j];



            // check if every row sum is

            // equal to prime diagonal sum

            if (rowSum != sum)

                return false;

        }



        // For sums of Columns

        for (int i = 0; i < N; i++) {



            int colSum = 0;

            for (int j = 0; j < N; j++)

                colSum += mat[j][i];



            // check if every column sum is

            // equal to prime diagonal sum

            if (sum != colSum)

                return false;

        }



        return true;

    }



// driver program to

// test above function

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row or column number: ");
        int N=sc.nextInt();

          int [][] mat= new int[N][N];

           for(int i=0;i<N;i++)
           {
               for (int j=0;j<N;j++){
                   mat[i][j]= sc.nextInt();
               }
           }



        if (isMagicSquare(mat,N))

            System.out.println("NO");

        else
            System.out.println(" Not a magic Square ");

    }
}
