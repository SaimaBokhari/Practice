package ternarystatements;

import java.util.Scanner;

public class TernaryStatementpg76 {
    public static void main(String[] args) {

        /*
        1) Type java code by using ternary and if-else, ask user to enter an integer,
        if the integer is even, output will be “The integer is even”. If the integer
        is odd, the output will be “The integer is odd”.
         */

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter an integer");
//        int num = scan.nextInt();
//        String result = num%2 == 0 ? "Even" : "Odd";
//        System.out.println(result);
//
//        /*
//        Type java code by using ternary and if-else. Ask user to enter two integers
//        Write a program to print the minimum one on the console.
//         */
//
//        System.out.println("Enter an integer a");
//        int a = scan.nextInt();
//
//        System.out.println("Enter an integer b");
//        int b = scan.nextInt();
//
//        double min = a<b ? a : b;
//        System.out.println(min);
//
        /*
        3) Type java code by using ternary.
        Write a program to print absolute value of an integer entered by user.
         */

//        System.out.println("Enter an integer");
//        int num1 = scan.nextInt();
//        int abs = num1%2 == 0 ? num1 : num1*(-1);
//
//        System.out.println(abs);
//
//        /*
//        Type java code by using using ternary.
//        Take values of length and width of a rectangle from user and check if it is square or not.
//         */
//
//        System.out.println("Enter length");
//        double l = scan.nextDouble();
//
//        System.out.println("Enter width");
//        double w = scan.nextDouble();
//
//        String area = l == w ? "it's a square" : "it's not a square";
//        System.out.println(area);
//
//        /*
//        5) Ask user to enter a String. If the String has 2 characters, output will be
//        "It is valid for state abbreviations” Otherwise,
//        output will be “It is not valid for state abbreviations”
//
//         */
//
//        System.out.println("Enter the abbreviation of a state");
//        String abr = scan.next();
//        String isValid = abr.length() == 2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
//        System.out.println(isValid);
//
//        /*
//        6) Ask user to enter an integer. If the number has 3 digits, output will be
//        “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
//        How can you decide the number of digits of an integer?
//         */
//
//        System.out.println("Enter an Integer");
//        int numX  = scan.nextInt();
//
//        String s1 = String.valueOf(numX);
//
//        String s2 = s1.length() == 3 ? "This number has 3 digits." : "This number doesn't have 3 digits.";
//        System.out.println(s2);


        /*
        7) Ask user ta enter a number. If the number is less than 10 and greater
        than or equal to 0, calculate its cube. Otherwise, calculate its square.
        Cube of a = a*a*a Square of a = a*a
         */

        System.out.println("Enter a number");
        int a = scan.nextInt();
        String value = a<10 &&  a>=0 ? "Cube of a:" + " "+ (a*a*a) : "Square of a:" + " " + (a*a);
        System.out.println(value);






    }
}
