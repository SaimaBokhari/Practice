package pptpracticeifstatements;

import java.util.Scanner;

public class IfElseStatementQ123 {
    public static void main(String[] args) {
        /*
        1) Ask user to enter his/her age. If the age is between 18 and 65 then
         output will be “You should work”,
         else output will be “No need to work”
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age please");
        short yourAge = input.nextShort();

        if (yourAge > 18 && yourAge < 65) {
            System.out.println("You should work");
        } else {
            System.out.println("No need to work");
        }

        /*
        Ask user to enter his/her age and gender. If the age is more than 65 and
        the gender is male then output will be “Hey man, you need to retire!” else output
        will be “Need to work”
         */

        System.out.println("Enter your age please");
        short age = input.nextShort();

        System.out.println("Enter your gender");
        String gender = input.next();

        if(age>65 && gender.equals("male")){
            System.out.println("Hey man, you need to retire!");
        }else{
            System.out.println("Need to work");
        }

        /*
        3) Ask user to enter a character, then check whether the character is alphabet or not
         */

        System.out.println("Enter a character");
        char ch = input.next().charAt(0);


        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("This is an alphabet");
        }else{
            System.out.println("This is not an alphabet");
        }











    }
}