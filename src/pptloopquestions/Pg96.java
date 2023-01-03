package pptloopquestions;

import java.util.Scanner;

public class Pg96 {
    public static void main(String[] args) {

        /*
        1) Write a program to print numbers from 1 to 5 on the console by using do-while loop.
         */
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 6);

        System.out.println();


        /*
        2)Write a program to print numbers from 10 to 3 on the console by using do-while loop.
         */

        int k = 10;
        do {
            System.out.print(k + " ");
            k--;
        } while (k > 2);

        System.out.println();

        /*
        3) Write a program to print numbers which are divisible by 5 between 1 and 100
        on the console by using do-while loop.
         */

        int i = 1;
        // While loop:

        while (i < 100) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++; // increment/decrement should be out of if }.

        }

        // Do while loop:
        do {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < 101);

        System.out.println();

        // Remember: Java reads code up to down and left to right.

       /*
       4) Write a program to print letters from c to m on the console by using do-while loop.
        */
        //1st way:

        char ch = 99;
        do {
            System.out.print(ch + " ");
            ch++;
        } while (ch < 110);

        System.out.println();

        // 2nd way:
        char character = 'c';
        do {
            System.out.print(character + " ");
            character++;
        } while (character < 'n');

        System.out.println();

        /*
        5) Ask user to enter a number.
        If the number is divisible by 10 then print "Won!" on the console otherwise ask user to enter another number.
        Use do-while loop.
         */

        Scanner input = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Enter a positive number");
            num = input.nextInt();

            if (num % 10 == 0) {
                System.out.println("You won!");
            }

        } while (num % 10 == 0);
        System.out.println("You lost!");





    }

}
