package replitquestions.ifswitchternary;

import java.util.Scanner;

public class Q3_IfStatement {
    /*
    Write a Java program to compute and print sum of
    two given numbers (more than or equal to zero).

If given integers or the sum have more than 10 digits, print "overflow".

EXAMPLE:

INPUT      :
Input two integers:

25

46

OUTPUT :

Sum of the numbers: 71
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum = num1 + num2;

        if(sum>=1000000000){
            System.out.println("Overflow");
        }else{
            System.out.println("Sum of the numbers is: "+ sum);
        }







    }

}
