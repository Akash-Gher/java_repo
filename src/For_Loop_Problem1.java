import java.util.Scanner;

public class For_Loop_Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers ");

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int power = 1;

        if (n2 >= 1) {

            for (int i = 1; i <= n2; i++) {

                power = power * n1;

            }

            System.out.println(power);

        }


    }
}
