import java.util.Scanner;

public class Calculator_Exception {


    public static void main(String[] args) throws NullPointerException  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int num1 = sc.nextInt();
       int num2 = sc.nextInt();




        try {
            //addition
            int sum = num1 + num2;
            System.out.println("Sum of to numbers is " + sum);

            //sub
            int sub = num1 - num2;
            System.out.println("Subtraction of two numbers is " + sub);

            //multiplication
            int mul = num1 * num2;
            System.out.println("Multiplication of two numbers is " + mul);

            //division

            float div=num1/num2;
            System.out.println("Division of Two number is "+div);
        }
        catch (ArithmeticException e) {
            System.out.println(
                    "Divided by zero operation cannot possible"+e.getMessage());
        }/*catch (NullPointerException e) {
            System.out.println(e);
        }*/
    }
}