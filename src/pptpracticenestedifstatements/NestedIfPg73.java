package pptpracticenestedifstatements;

import java.util.Scanner;

public class NestedIfPg73 {
    public static void main(String[] args) {

     /*
     Nested if() Statement Questions
     1)  Type java code by using nested if statement,
     If a number is even then check if it is divisible by 3 or not.
     If it is divisible by 3 the output will be
     “Perfect even number” otherwise, the output will be “Good even number.”
     If the number is odd then check if it is divisible by 3 or not. If it is divisible
     by 3 the output will be “Perfect odd number”
     otherwise, the output will be “Good odd number.”
      */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number please");
        int num = scan.nextInt();

        if(num%2 == 0){
            if(num%3 == 0){
                System.out.println("Perfect even number");
            }else{
                System.out.println("Good even number");
            }
        }else if(num%2 !=0) {
            if (num % 3 == 0) {
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good odd number");
            }
        }


        /*
        2) Type java code by using nested if() statement.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */

        System.out.println("Enter a year");
        int year = scan.nextInt();

        if(year%100 == 0) {
            if (year%400 == 0) {
                System.out.println("Leap year");
            }
        }else if(year%100 != 0){
            if(year%4 == 0){
            }
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }


        /*
        Type java code by using nested if() statement.
        Ask user to enter a password
        If the initial of the password is uppercase then check if it is ‘A’ or not.
        If it is ‘A’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid

        If the initial of the password is lowercase then check if it is ‘z’ or not.
        If it is ‘z’ the output will be “Valid Password”
        otherwise the output will be “Invalid Password”
        For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid
         */

        System.out.println("Enter your password");
        char pswInitial = scan.next().charAt(0);

        if(pswInitial>='A' && pswInitial<='Z'){
            if(pswInitial == 'A'){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }
        }else if(pswInitial>='a' && pswInitial<= 'z'){
            if(pswInitial == 'z'){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }
        }









    }
}
