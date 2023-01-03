package replitquestions.arrays;

import java.util.Collections;

public class Q25_Arrays_MinMaxOfIntArray {
    public static void main(String[] args) {

        /*
        Write a method that accepts an integer array as input and prints the minimum and
        the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
         */
        int[] a = {3,2,5,4,1,6};

        int maxValue = getMaxValue(a);
        int minValue = getMinValue(a);

        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);

    }

    public static int getMaxValue(int[] a) {
        int maxValue = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        return maxValue;

    }
        public static int getMinValue(int [] a){
            int minValue = a[0];
            for(int i=0; i<a.length; i++){
                if(a[i] < minValue){
                    minValue = a[i];
                }
            }
            return minValue;

    }
}
