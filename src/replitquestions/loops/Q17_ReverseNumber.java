package replitquestions.loops;

import java.util.Scanner;

public class Q17_ReverseNumber {
    public static void main(String[] args) {

        /*
        Write a java program to reverse the number which user entered.

Input  :1238
Output :Reverse Of The Number: 8321

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = input.nextInt();

        int reverse = 0;

        while(number !=0){
            int remainder = number%10;
            //System.out.print(remainder);
           number = number/10;
          //  System.out.println(number);
            reverse= reverse * 10 + remainder;
          //  System.out.println(reverse);
        }
        System.out.println("Reverse of the number is: " + reverse);












    }
}
