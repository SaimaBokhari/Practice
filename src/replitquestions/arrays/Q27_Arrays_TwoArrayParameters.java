package replitquestions.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q27_Arrays_TwoArrayParameters {
    /*
    Write a return method that accepts 2 integer Arrays as parameters
    And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements to add into first array");
        int n1 = input.nextInt();
        int[] a = new int[n1];
        ;

        System.out.println("Enter " + n1 + " elements" );
        for(int i=0; i<a.length;i++){
            a[i] = input.nextInt();
        }

        System.out.println("Enter the number of elements to add into second array");
        int n2 = input.nextInt();
        int[] b = new int[n2];
        ;

        System.out.println("Enter " + n2 + " elements" );
        for(int i=0; i<b.length;i++){
            b[i] = input.nextInt();
        }

        int length = a.length +b.length;
        int[] newArray = new int[length];

        int sum = 0;
        for(int w: a){
            newArray[sum] = w;
            sum++;
        }
        for(int w: b){
            newArray[sum]= w;
            sum++;
        }
        System.out.println(Arrays.toString(newArray));







    }


}
