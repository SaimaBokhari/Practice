package practicewithmssara05;

import java.util.Arrays;

public class Q03_FindElementsInMiddle {
    public static void main(String[] args) {
        /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
         */

        int[] a = {12, 5, 8, 21, 13, 15, 50};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int middleIdx = a.length/2;  // 3.5 ==> Java will return just 3
        System.out.println(middleIdx);

        if(a.length%2 !=0){
            System.out.println(middleIdx);
        }else{
            System.out.println((a[a.length/2]+a[a.length/2-1])/2);
          //  System.out.println((a[middleIdx] + a[middleIdx-1])/2); // if the array has one more digit i.e. 8, it becomes even length so
        }                          // (4 + 4-1)/2= 3.5 .. Java will return 3 only


        // another way:

        int arr [] = {12, 8, 5, 10};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (arr.length%2!=0){
            System.out.println((arr[arr.length / 2]));
        }else {
            System.out.println((arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2);
        }


    }
}
