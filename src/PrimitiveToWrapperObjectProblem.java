public class PrimitiveToWrapperObjectProblem {
    /*
    Convert Primitive Type to Wrapper Objects (boxing/autoboxing)
For the following:
int a = 9;
double d = 6.78;
and check if they are converted to wrapper classes
Sample output:
An object of Integer is created.
An object of Double is created.

     */

    public static void main(String[] args) {

        int a = 9;          //primitive types
        double b = 6.78;


        Integer WrapperInt = a;      //converting to wrapper objects
        Double WrapperDouble = b;


        if(WrapperInt instanceof Integer) {                 //checking if instances is created or not
            System.out.println("An object of Integer is created.");
        }

        if(WrapperDouble instanceof Double) {
            System.out.println("An object of Double is created.");
        }


    }

}
