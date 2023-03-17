
import java.util.Arrays;

public class StatsCalculator {
    private double[] sortedTestValues;
    private double[] userDoubles = new double[7];
    static StatsCalculatorTester newStatsCalculater = new StatsCalculatorTester();
    static double[] importedUserDoubles = newStatsCalculater.userDoubles;

    /**
     * Find the maximum value in an array
     *
     * @param arr input array
     * @return maximum value of array or Integer.MIN_VALUE if array is empty
     */
    public static double findMax(double[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        double max = arr[0];
        for (double value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * @StatsCalculator This is a default constructor that makes an array of size 20 full of 0s
     */
    
    public static void StatsCalculator()
    {
        double[] doubleArr = new double[20];
    }

    public static void StatsCalculator(double[] values)
    {
        double[] twentyArray = values;
    }

    public static void


    public static void sortData(double[] sortedTestValues)
    {
        sortedTestValues = importedUserDoubles;
        Arrays.sort(sortedTestValues);
    }






    public double calculateMax()
    {

    }

}

