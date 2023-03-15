
import java.util.Arrays; //need this to sort arrays
import java.util.Scanner;
public class StatsCalculatorTester
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        double[] userDoubles = new double[7];
        System.out.println("Enter 7 Values");

        for(int i = 0; i < 7; i++)
        {
            userDoubles[i] = input.nextDouble();
        }

        Arrays.sort(userDoubles);

        //to print arrays we can use an enhanced for loop
        System.out.println("Your sorted data is: ");
        for (double value : userDoubles) {
            System.out.print(value + ", ");
        }


    }
}