package pptloopquestions;

import java.util.Scanner;

public class Pg93 {
    public static void main(String[] args) {

        /*
        1) Type java code by using while loop, Write a program to print numbers from 1 to 5.
         */

//        int i=0;
//        while(i<6){
//            System.out.print(i + " ");
//            i++;
//        }
//
//        System.out.println();

        /*
        2) Type java code by using while loop.
        Write a program that types first 30 consecutive odd integers.
         */

        int j=0;
        while(j<=30){
            if(j%2 !=0)
            System.out.print(j + " ");
            j++;
        }

        System.out.println();

        /*
        3) Type java code by using while loop, Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = input.nextInt();
        int k = 1;
        while(k<11){
            System.out.print(num*k + " ");
            k++;
        }

        System.out.println();

        /*
        4) Type java code by using while loop,
        Write a program that prompts the user to input a positive integer.
        It should then print factorial of that number.
         */


        System.out.println("Enter a positive integer to find factoriel");
        int a = input.nextInt();


        int fact = 1;
        int x = 1;
        while (x <= a) {
            fact = fact * x;
            x++;
        }

        // fact is a kind of multiplication because of that we create empty container
        // while loop will start from 1 to given number and it will make multiplication













    }
}
