import java.util.Scanner;

public class Custom_Exception_Problem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Amusement park ticket vending machine\n");
        System.out.println("Enter your height in cm:");
        int height=sc.nextInt();

        try{
            if(height<120){
                throw new Eligibility_Exception_class("not allowed");
            }else
                System.out.println("you are allowed");
        } catch (Eligibility_Exception_class eec) {
            //exception.printStackTrace();
            System.out.println("Show with kids < 120 cm Not eligible for roller-coaster ride\n");
        }
    }
}
