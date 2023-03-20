
import java.util.Arrays;

/**
 * @file StatsCalculator.java
 * @author Aiden Michael Leon Guerrero San Nicolas
 * @date 3/17/2023
 * @description It'll create an Array while given no array has a defualt constructor.
 */


public class StatsCalculator {

    //private arrays;
    private double[] userValues;
    private double[] sortedValues;

    /**
     * @descripton StatsCalculator() - the defualt constructor making a array of size 20 full of 0s
     */

    public StatsCalculator() {

        userValues = new double[20];
    }

    /**
     *
     * @param value which represent the array being taken in and set equal to
     * @var values!!!
     * @description this sets the value of that array to the array in the class, so it can be used.
     */

    public StatsCalculator(double[] value) {
        userValues = value;
    }

    /**
     * @description this sorts the data and stores the data in the array
     */
    public void sortData() {
        sortedValues = userValues;
        Arrays.sort(sortedValues);

    }

    /**
     * @description Uses a for loop to iterate through the values array to find the max.
     * @returns the Max double in the values array.
     */
    public double calculateMax() {
        double max = userValues[0];
        for (int i = 0; i < userValues.length; i++) {
            if (max < userValues[i]) {
                max = userValues[i];
            }
        }
        return max;
    }

    /**
     * @description uses a for loop to iterate through the values array to find the min.
     * @returns the Min double in the values array.
     */
    public double calculateMin() {
        double min = userValues[0];
        for (int i = 0; i < userValues.length; i++) {
            if (min > userValues[i]) {
                min = userValues[i];
            }
        }
        return min;
    }

    /**
     * @description sorts the array and finds the first quartile within the array sortedValues.
     * @returns the first quartile value within the array sortedValues.
     */
    public double calculateFirstQuartile() {
        sortData();
        int index = 0;
        double[] firstHalf;

        firstHalf = new double[sortedValues.length / 2];
        for (int i = 0; i < firstHalf.length - 1; i++) {
            firstHalf[i] = sortedValues[i];}
        if(firstHalf.length%2==1) {
            return firstHalf[firstHalf.length / 2];
        }else{
            return (firstHalf[firstHalf.length / 2] + firstHalf[firstHalf.length / 2 - 1]) / 2.0;
        }


    }


    /**
     * @description sorts the array and finds the third quartile within the array sortedValues
     * @returns value of the third quartile with in the array sortedValues.
     */
    public double calculateThirdQuartile() {
        sortData();

        double [] lastHalf;
        if (sortedValues.length % 2 == 1) {
            lastHalf = new double [sortedValues.length/2];
            int indxLast=0;
            for(int i =sortedValues.length/2+1;i<sortedValues.length;i++){
                lastHalf[indxLast] = sortedValues[i];
                indxLast++;
            }
            if(lastHalf.length%2==1) {
                return lastHalf[lastHalf.length/2];
            }else{
                return (lastHalf[lastHalf.length/2]+lastHalf[lastHalf.length/2-1])/2;
            }



        } else  {
            lastHalf= new double [sortedValues.length/2];
            int indxLast=0;
            for(int i =sortedValues.length/2;i<sortedValues.length-1;i++){
                lastHalf[indxLast] = sortedValues[i];
                indxLast++;
            }
            if(lastHalf.length%2==1) {
                return lastHalf[lastHalf.length/2];
            }else{
                return (lastHalf[lastHalf.length / 2] + lastHalf[lastHalf.length / 2 - 1]) / 2.0;
            }


        }
    }


    /**
     * @descripton sorts data ; calculates the median within the sortedValues array.
     * @return the median within the sortedValues array.
     */
    public double calculateMedian() {
        sortData();
        int inx = 0;
        if (sortedValues.length % 2 == 1) {
            return sortedValues[sortedValues.length/2];
        } else  {
            return (sortedValues[sortedValues.length / 2-1] + sortedValues[sortedValues.length/ 2 ])/2.0;

        }

    }

    /**
     * @description adds all the values together and
     * @returns the sum.
     */
    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < userValues.length; i++) {
            sum = sum + userValues[i];
        }
        return sum;
    }

    /**
     * @description calculates the mean by using the calculateSum() method and dividing it my the length of the array.
     * @return the Mean of the array.
     */
    public double calculateMean() {
        return calculateSum() / userValues.length;
    }

    /**
     * @description prints out all the data in the array a single line with spaces in between.
     */
    public void print() {
        for (double i : userValues) {
            System.out.print(i+" ");
        }
    }

    /**
     * @printSorted prints out all the data within the array with spaces in between, but sorted.
     */
    public void printSorted()
    {
        System.out.println();
        for (double i : sortedValues)
        {
            System.out.print(i + " ");
        }
    }

    /**
     * @printFiveNumberSummary prints out the five number summary tabbed
     * (min,first quartile, median, third quartile, and max)
     * with each value on another line.
     */
    public void printFiveNumberSummary()
    {
        System.out.println();
        System.out.println("The five number summary is:");
        System.out.println("\tMinimum: " + calculateMin());
        System.out.println("\tFirst Quartile: " + calculateFirstQuartile());
        System.out.println("\tMedian: " + calculateMedian());
        System.out.println("\tThird Quartile: " + calculateThirdQuartile());
        System.out.println("\tMaximum: " + calculateMax());
    }
}


