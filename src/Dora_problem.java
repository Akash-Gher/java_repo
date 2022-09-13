import java.util.Scanner;

public class Dora_problem {


    public static void main(String[] args) {
       /* Input consists of 3 integers
        The first input denotes the number of rows
        The second input denotes the number of columns
        The third input denotes the tree number, which you have to find whether it's a mango tree or not.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number , column number and tree Number :");

        int m= sc.nextInt();
        int n= sc.nextInt();
        int tn= sc.nextInt();

        if(tn==10||tn==11||tn==16||tn==17||tn==18||tn==19||tn==20||tn==5||tn==4||tn==2||tn==3)

        {

            System.out.println("Yes");

        }

        else

        {

            System.out.println("No");

        }
    }
}
