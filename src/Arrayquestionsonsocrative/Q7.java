package Arrayquestionsonsocrative;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {

        int arr[] = new int[3];

        System.out.println(arr[1]);  // 0

        arr[0] = 11;

        arr[1] = 12;

        System.out.println(Arrays.toString(arr));  // 11,12.0



        /* Q.8.
        Data types of all elements must be same in an array.
        Arrays can store primitive data types and references.
         */

       // 9.
        int arr1[] = {3, 2, 3, 4, 4, 5};

        int count = 0;

        for(int i=0; i<arr1.length; i++) {
            if(arr1[i]==3) {
                count++;
            }
        }
        System.out.println(count); // 2

        // 10.

        char arr2[] = new char[4]; // default char value is '' means empty in the elements
        arr2[0] = 'A';
        arr2[2] = 'E';
        arr2[3] = 'M';

        System.out.println(Arrays.toString(arr2));

        // 11.

            int x[] = { 3, 5, 7 };
            int a = 0;
            int b = 0;

            while (a < x.length) {
                b = b + x[a];
                a++;
            }
            System.out.println(b);





    }
}
