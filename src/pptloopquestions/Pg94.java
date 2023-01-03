package pptloopquestions;

import java.util.Scanner;

public class Pg94 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        5) Type java code by using while loop,
        Write a program to count the factors of an integer which
        is entered by user.
         */

        System.out.println("Enter a positive integer");
        int number = input.nextInt();

        int i=1;

        while(i <= number) {
            if(number%i == 0) {
                System.out.println(i);
            }
            i=i+1;

            }









        /*
        6) Type java code by using while loop,
        Write a program that prompts the user to input an integer.
        It should then find sum of the digits of that number.
         */

//        System.out.println("Enter a positive integer");
//        int num = input.nextInt();
//
//        int sumOfDigits = 0;
//        while(num>0){
//            sumOfDigits = sumOfDigits + (num%10);
//            num = num/10;
//        }
//        System.out.println(sumOfDigits);










    }
}
