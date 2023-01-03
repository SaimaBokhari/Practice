package reviewqpg87;

import java.util.Scanner;

public class ReviewQuestionsPg87 {
    public static void main(String[] args) {
/*
1) Ask user to enter an integer, if it is less than 10, calculate its square
and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console.
Otherwise, keep the number same and print it on the console.
 */

        Scanner scan = new Scanner(System. in);

        System.out.println("Enter an integer please");
        int num = scan.nextInt();

        String value;
        if (num >=0) {
            System.out.println("Square of the num:" + " " + (num*num));
        } else if (num >=10){
                System.out.println("Square of the num:" + " " + (2 * (num * num)));
        }else{
            System.out.println(num);
        }

//        String value = (num < 10) ? ("Square of the num:" + " " + (num*num)) : (num > 10) ? ("Square of the num:" + " " + (2 * (num * num))) : (num);
//        System.out.println(value);

/*
2)   Ask user to enter his kid’s name, if the name contains “a” output will be
     “This name contains ‘a’.”
      if the name contains “z” output will be “This name contains ‘z’.”
     Otherwise, output will be “This name contains neither ‘a’ nor ‘z’.”
 */
        System.out.println("Enter your child's name");
        String name = scan.next();

         if(name.contains("a") && !name.contains("z") ){
             System.out.println("This name contains ‘a’");
         }else if(name.contains("z") && !name.contains("a")){
             System.out.println("This name contains ‘z’");
         }else if(name.contains("z") && name.contains("a")){
             System.out.println("This name contains 'a' and ‘z’");
         }else{
             System.out.println("This name neither contains ‘a’ nor 'z' ");
         }

/*
3) Ask user to enter a letter, if it is uppercase, check it is before “F” or not in alphabetical order.
If it is before “F” in alphabetical order, output will be “ Big before F”, otherwise output will be
“Big after F.”
If it is lowercase check it is before “h” or not in alphabetical order.
If it is before “h” in alphabetical order,
 output will be “Small before h”, otherwise “Small after h”
 */
        System.out.println("Enter a letter");
        char l = scan.next().charAt(0);

        if (l >= 'A' && l <= 'Z') {
            if (l >= 'A' && l < 'F') {
                System.out.println("Big before F");
            } else {
                System.out.println("Big after F");
            }
        } else if (l >= 'a' && l <= 'z') {
            if (l >= 'a' && l < 'h') {
                System.out.println("Small before h");
            } else {
                System.out.println("Small after h");
            }

        } else {
            System.out.println("Please enter a proper letter");
        }


/*
4)   Ask user to enter his/her first and last name. If the first name is longer
output will be “First name is longer.” If the length of first name is equal
to the length of last name, output will be “First name and last name
have same length.”
Otherwise, output will be “Last name is longer”
 */
        System.out.println("Enter your first name");
        int firstName = scan.next().length();

        System.out.println("Enter your last name");
        int lastName = scan.next().length();

        if (firstName > lastName){
            System.out.println("First name is longer.");
        }else if(firstName == lastName){
            System.out.println("First name and last name have same length");
        }else if(firstName < lastName) {
            System.out.println("First name is shorter than last name");
        }else{
            System.out.println("Invalid information");
        }






    }
}
