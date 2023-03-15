
import java.util.Arrays;

public class StatsCalculator {
    private double[] sortedTestValues;

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

    public static void StatsCalculator() {
        double[] twentyArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
    }

    public static void StatsCalculator(double[] values) {
        double[] twentyArray = values;
    }

 /*
    public void sortData(StatsCalculatorTester.testValues())
    {
        Arrays.sort(testValues);
    }




    public double calculateMax()
    {

    }
*/

}

