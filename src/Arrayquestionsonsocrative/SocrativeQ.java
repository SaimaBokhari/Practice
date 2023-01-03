package Arrayquestionsonsocrative;

import java.util.Arrays;

public class SocrativeQ {
    public static void main(String[] args) {
        /*
        1.
        Note: There are 2 different ways to create an array;

           1) int arr[] = new int[4];

               arr[0]=11;   arr[1]=12;   arr[2]=13;   arr[3]=14;

//           2) int arr[] = {11, 12, 13, 14};
//         */
//        int arr[] = {11, 12, 13, 14};
//
//        for(int i=0; i<4; i++) {
//            System.out.print(arr[i] + " ");
//        }

        /*
        2. Note: If you type the name of the array in method parenthesis of Arrays.sort(),
        the array elements will be sorted in ascending order.
         */

        int arr1[] = {2, 11, 0, 23, 7};

        Arrays.sort(arr1);

        System.out.println(arr1[arr1.length-1]);

        /*
        3.

         */



    }
}
