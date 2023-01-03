package Arrayquestionsonsocrative;

import java.util.Arrays;

public class PptPg134 {
    public static void main(String[] args) {

        /*
    Type a program like; given an array whose length is 3, return an array with the
elements "rotated left"
For example; if the array is [1, 2, 3] output will be [2, 3, 1].
     */


        // Rotate:

        int s[] = {1,2,3, 4, 5};
        int rotated[] = new int[s.length];

        int idx = 1;

        for (int i=1; i<s.length;i++){
            rotated[i-1]=s[i];
        }
        rotated[rotated.length-1]=s[0];
        System.out.println(Arrays.toString(rotated));


        // reverse

        int arr[] = {1,2,3, 4, 5};
        int brr[] = new int[arr.length];


        int indx = arr.length-1;

        for( int w: arr){
            brr[indx] = w ;
            indx--;

        } System.out.println(Arrays.toString(brr));//[3, 2, 1]





    }

}
