package multidimensionalarrays;

import java.util.Arrays;

public class Pg142 {
    public static void main(String[] args) {

/*
1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
 */

        int a[][] = { {1,2,3}, {4,5,6} };

        int sum =0;
        for(int[] w: a){
            for(int u:w){
                sum = sum + u;
            }
        }
        System.out.println(sum);

        System.out.println();
/*
2) Find the product of the last elements in the array elements of the
given multi dimensional array { {1,2,3}, {4,5}, {6} }
 */
        int b[][] = { {1,2,3}, {4,5}, {6} };

        int b1 = b[0][2];
        int b2 = b[1][1];
        int b3 = b[2][0];
        System.out.println ((b1*b2*b3));
        System.out.println();
/*
3) Find the sum of the elements whose indexes are same in the given two multidimensional arrays
arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
 */

       int arr[][] = { {1,2}, {3,4,5}, {6} };
       int brr[][] = { {7,8,9}, {10,11}, {12}};

       int arr1 = arr[0][0], arr2 = arr[0][1], arr3 = arr[1][0], arr4 = arr[1][1], arr5 = arr[1][2], arr6 = arr[2][0];
       int brr1 = brr[0][0], brr2 = brr[0][1], brr3 = brr[0][2], brr4 = brr[1][0], brr5 = brr[1][1], brr6 = brr[2][0];
        System.out.println(arr1+brr1+arr2+brr2+arr6+brr6);

        System.out.println();


/*
4) Find the sum of the elements in the array elements of the given multi dimensional array
{ {1,2,3}, {4,5}, {6,7} } and return an array.
For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
 */

//        int[][] crr={{1,2,3},{4,5},{6,7}};
//        int x=crr.length;
//        System.out.println(x);    // 3  Get the number of elements from the multidimensional arrays.
//
//        int[] drr= new int[x];    // assign the elements to a new array but this array is single dimensional
//
//        int i=0;
//
//        for(int[]w:crr){
//
//            int sum1=0;  // [6, 9, 13]  // sum1 container needs to be inside the outer loop coz sum1 should be "0" for each outer loop
//
//            for(int u:w){
//                sum1=sum1+u;
//            }
//            drr[i]=sum1;
//            i++;
//        }
//        System.out.println(Arrays.toString(drr));
//        System.out.println("=====================");
//

        /*
        5) Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
Hint: Use split()
         */

//        String str = ("Java is easy, if you study. Nothing is easy, if you do not study");
//        String[] str1 = str.split(" ");
//        System.out.println(Arrays.toString(str1));
//
//        int str2 = str1.length;
//        System.out.println(str2);     // 14

        /*
        6) Write a Java program to remove a specific element from an array.
         */

       // int array:
        int[] grr = {25, 56, 15, 26, 6, 74, 18, 29};

        System.out.println(Arrays.toString(grr));

        // Remove the second element (index->1, value->56) of the array
        int removeIndex = 1;

        for(int i = removeIndex; i < grr.length -1; i++){
            grr[i] = grr[i + 1];
        }
        System.out.println("After removing: "+Arrays.toString(grr));

//        // Another way by Yasin:

//        int[] drr = {25, 56, 15, 26, 6, 74, 18, 29};
//        int remove=56;
//        int idx=0;
//        int[] brr=new int[drr.length];
//        for (int i=0;i< drr.length;i++){
//            if (drr[i]==remove){
//                continue;
//            }brr[idx]=drr[i];
//            idx++;
//        }
//        System.out.println(Arrays.toString(brr));

        // String array:
        String st = ("Java is easy, if you study. Nothing is easy, if you do not study");
        String[] st1 = st.split(" ");
        System.out.println(Arrays.toString(st1));

        int idx = 5;

        for(int i = idx; i < st1.length-1; i++){
            st1[i] = st1[i + 1];
        }
        System.out.println("After removing: "+Arrays.toString(st1));

        // Another solution done by Yasin
        String s="Java is easy, if you study. Nothing is easy, if you do not study";
        String str[]=s.split(" ");
        System.out.println(Arrays.toString(str));
        String ntr[]=new String[str.length];

        String removed="Nothing";
        int idx2=0;

        for (int i=0;i< str.length;i++){
            if (str[i].equals(removed)){
                continue;
            }ntr[idx2]=str[i];
            idx2++;
        }
        System.out.println(Arrays.toString(ntr));







    }
}
