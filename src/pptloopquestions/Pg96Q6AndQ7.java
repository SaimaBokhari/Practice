package pptloopquestions;

import java.util.Scanner;

public class Pg96Q6AndQ7 {

    public static void main(String[] args) {

        /*
        6) Ask user to enter a name.
       If the name contains the letter ‘a’ then print "Won!" on the console otherwise ask user to enter another name.
       Use do-while loop.
         */

        Scanner input = new Scanner(System.in);

//        int counter = 0;
//
//        do {
//            System.out.println("Enter your username");
//            String userName = input.next();
//
//            counter++;
//            if (userName.contains("a")){
//                System.out.println("You won!");
//                break;
//            }
//        }while (true);
//
//        System.out.println();
//
//        /*
//        7) Ask user to enter a String. Print the characters whose indexes are odd on the console
//        For example; Germany ==> e m n
//         */
//
//        System.out.println("Enter a String please!");
//        String s = input.nextLine();
//        int i= 0;
//        do {
//            String c = s.substring(i, i + 1);
//            if (s.indexOf(c) % 2 != 0) {
//                System.out.print( c + " ");
//            }
//            i++;
//        }while(i<s.length());



        /*
        You take a loan from a friend and need to calculate how much you will owe him after 3 months.
        You are going to pay him back 10% of the remaining loan amount each month.
        Create a program that takes the loan amount as input, calculates and outputs the remaining
        amount after 3 months.
         */

        System.out.println("Enter the amount of loan");
        int loan = input.nextInt();

        System.out.println("Enter month number");
        int month= input.nextInt();

        for (int i = 1; i < month+1 ; i++) {

            loan = (loan*9/10);
        }
        System.out.println("remaining loan after " +month + " month: " + loan);







    }



}

