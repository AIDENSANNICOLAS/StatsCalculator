
import java.util.Arrays; //need this to sort arrays
import java.util.Scanner;
public class StatsCalculatorTester
{

    public static void main(String[] args) {
        double[] testValues = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};

        //sort is a static method that belongs to the Array class, so to call it
        //we use the form ClassName.methodName(params). We are not creating an object
        Arrays.sort(testValues);


        //to print arrays we can use an enhanced for loop
        System.out.println("Enhanced for loop printing: ");
        for (double value : testValues) {
            System.out.print(value + ", ");
        }


    }
}