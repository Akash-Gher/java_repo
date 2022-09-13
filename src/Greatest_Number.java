import java.util.Scanner;

public class Greatest_Number {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Integers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();



        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

