package listquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pg152 {
    public static void main(String[] args) {
        /* List question 1
        1)Create a String list whose elements are A, C, E, and F. Print it on the console.
         */
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("C");
        a.add("E");
        a.add("F");

        System.out.println(a);    // [A, C, E, F]

        /*
        2)By using add() with index method, add B into the 1st index.
List elements should be like A, B, C, E, and F. Print it on the console
         */

        a.add(1, "B");
        System.out.println(a);    // [A, B, C, E, F]

        /*
        3)By using set() method, convert E to D.
List elements should be like A, B, C, D, and F. Print it on the console
         */
        a.set(3, "D");
        System.out.println(a);    // [A, B, C, D, F]

        /*
        4)By using remove() method, remove F from the list.
List elements should be like A, B, C, D. Print it on the console
         */

        a.remove(4);
        System.out.println(a);   // [A, B, C, D]

        /*
        5)Find the size of the list and print the size on the console.
         */
        int sizeOfA = a.size();
        System.out.println(sizeOfA);
        System.out.println("======================");
        /*
        List Question 02:
Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
         */

        int [][] arr = { {1,2,3}, {4,5}, {6,7} };

        int length = arr.length;
        System.out.println(length);   // arr has 3 elements

        int[] brr = new int[length];    // assign those elements to a new array.

        int i = 0;

        for(int[] w: arr){

            int sum = 0;
            for(int u:w){
                sum = sum + u;
            }
            brr[i] = sum;
            i++;
        }
        System.out.println(Arrays.toString(brr));


        //A number is called an Armstrong number if it equals the sum of the cube of its every digit.
//For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
//cube of every digit. Type a code to check if the given number is the Armstrong number or
//not.
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num= input.nextInt();
//        int a=0;
//        int kntrl=0;
//        for (int i =num; i<0; i=i/10){
//            a=i%10;
//            kntrl= kntrl +(a*a*a);
//        }
//        if (kntrl==num){
//            System.out.println("armstrong ");
//        }else{
//            System.out.println("not");
//        }










    }
}
