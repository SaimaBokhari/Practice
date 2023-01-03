package pptpracticeifstatements;

import java.util.Scanner;

public class IfElseStatementQ7Q8 {
    public static void main(String[] args) {

        /*
        7) Type java code by using if-else statement.
        A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        Ask user for quantity and unit price then judge and print total cost for user.
        If the quantity is less than 1000 output will be “No discount.”
         */

        Scanner input = new Scanner(System.in);

        System.out.println("How many unit?");
        int units = input.nextInt();
        System.out.println(units);

        int price = 100;
        if(units*price>1000){

            System.out.println("Discounted cost is:" + " " + (units*price*.1));
        }else if(units*price<1000){
            System.out.println("No discount");
        }

        /*
        8) Ask user ta enter a 4 digits integer, then print the sum of the first
        and the last digit of the number on console.
        For example; if user enters 1234 you will add 1 and 4,
        then print on the console 5
         */

        System.out.println("Enter a four digit number please");
        int num = input.nextInt();

        int firstDigit = num/1000;
        int lastDigit = num%10;

        System.out.println("Sum of first and last digit:" +" " + (firstDigit+lastDigit));



    }
}
