import java.util.Scanner;

public class Random_Number_guess_problem2 {
    public static void main(String[] args) {

        int myNumber= (int)(Math.random()*100);
        int userNumber=0;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Guess my Number(1-100): ");
            userNumber = sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("WOOHOO... CORRECT NUMBER!!!");
                break;

            }
            else if (userNumber>myNumber) {
                System.out.println("Too high, try again.");

            }
            else{
                System.out.println("Too low, try again.");
            }


        }


        while (userNumber>=0);
        System.out.println("My Number was: ");
        System.out.println(myNumber);






    }
}
