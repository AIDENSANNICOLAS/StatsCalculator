
import java.util.Arrays; //need this to sort arrays
import java.util.Scanner;
public class StatsCalculatorTester
{

    public static double[] userDoubles = new double[7];

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 7 Values");

        for(int i = 0; i < 7; i++)
        {
            userDoubles[i] = input.nextDouble();
        }




        /**
         * This prints out your data from smallest to biggest
         * @param
         */
        System.out.println("Your sorted data is: ");
        for (double value : userDoubles)
        {
            System.out.print(value + ", ");
        }


    }
}