import java.util.Arrays; //need this to sort arrays

public class StatsCalculator {
    public static void main(String[] args) {
        double[] testValues = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};

        //sort is a static method that belongs to the Array class, so to call it
        //we use the form ClassName.methodName(params). We are not creating an object
        Arrays.sort(testValues);

        //to print arrays we can use an enhanced for loop
        System.out.println("Enhanced for loop printing: ");
        for(double value: testValues)
        {
            System.out.print(value + ", ");
        }
        System.out.println("\ntoString method printing: ");

        //or you can use the toString method in the Arrays class
       /* System.out.println(Arrays.toString(testValues));

        System.out.println("\nThe max value is: " + findMax(testValues));
*/
    }

    /**
     * Find the maximum value in an array
     * @param arr input array
     * @return maximum value of array or Integer.MIN_VALUE if array is empty
     */
    public static double findMax(double[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        double max = arr[0];
        for(double value: arr){
            if(value>max){
                max = value;
            }
        }
        return max;
    }

    //you are to complete methods for finding the min, sum, median, average



}