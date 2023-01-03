package foreachloop;

import java.util.Arrays;
import java.util.List;

public class Pg157 {
    public static void main(String[] args) {
        /*
        For-each Question 1:
Create an integer array find the sum of all elements by using for-each loop
and print the sum on the console.
         */

        int a[] = {12,8,43};
        int sum =0;
        for(int w:a){
            sum = sum+w;
        }
        System.out.println(sum);

        /*
        For-each Question 2:
Create a list find the sum of all elements by using for-each loop
and print the sum on the console.
         */

//        List<Integer> b = new ArrayList<>();
//        b.add(47);
//        b.add(34);
//        b.add(12);
//        b.add(98);
//        System.out.println(b);
        // Other way of creating list

        List<Integer> b = Arrays.asList(47, 34, 12, 98);
        int sum1 =0;
        for(Integer w:b){
            sum1 = sum1+w;
        }
        System.out.println(sum1);


        /*
        For-each Question 3:
Write a Java program to find the common elements between two
arrays (string values).
         */

        String arr[] = {"I love Java"};
        String brr[] = {"I love Java", "Learn Java" , "Earn money"};


        for(String w:arr){
            for(String u:brr){
                if(w==u){
                    System.out.println(w + " ");
                }
            }
        }














//        int we[] = { 2, 4, 5, 9,10,115 };
//
//        int we1[] = { 4,115,118,117,116,115,114,113,112};
//
//        int i = 0, j = 0;
//
//        while (i < we.length && j < we1.length) {
//
//            if (we[i] == we1[j]) {
//
//                System.out.println(we[i] + " ");
//
//                i++;
//
//                j++;
//
//            } else if (we[i] < we1[j]) {
//
//                i++;
//
//            } else {
//
//                j++;
//
//            }
//
//        }



    }
}
