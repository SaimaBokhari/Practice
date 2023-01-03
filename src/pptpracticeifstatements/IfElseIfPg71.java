package pptpracticeifstatements;

import java.util.Scanner;

public class IfElseIfPg71 {
    public static void main(String[] args) {
//        /*
//        1) Type java code by using if-else if() statement,
//        if both of the two integers are positive, output will be the sum of them.
//        If both of the two integers are negative, output will be the multiplication of them.
//        Otherwise; output will be “I cannot add or multiply different signed numbers”
//         */
//
        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter the value of a");
//       int a = scan.nextInt();
//
//        System.out.println("Enter the value of b");
//        int b = scan.nextInt();
//
//        if(a>0 && b>0){
//            System.out.println(a+b);
//        }else if(a<0 && b<0){
//            System.out.println(a*b);
//        }else{
//            System.out.println("I cannot add or multiply different signed numbers");
//        }
//
//        /*
//        Type java code by using if-else if() statement,
//        If age is less than 13 output will be “Should not work”,
//        If age is greater than 65 output will be “Retired”,
//        Otherwise; output will be “Should work”
//         */
//        System.out.println("Enter your age");
//        int age = scan.nextInt();
//
//        if(age<13){
//            System.out.println("Should not work");
//        }else if(age>65){
//            System.out.println("Retired");
//        }else{
//            System.out.println("Should work");
//        }
//
//        /*
//        Type java code by using if-else if() statement.
//        A school has following rules for grading system:
//        1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
//        Ask user to enter marks and print the corresponding grade.
//         */
//
//        System.out.println("Enter your marks");
//        int marks = scan.nextInt();
//
//        if(marks<50){
//            System.out.println("D");
//        }else if(marks<60){
//            System.out.println("C");
//        }else if(marks<=80){
//            System.out.println("B");
//        }else if(marks<100){
//            System.out.println("A");
//        }else {
//            System.out.println("Invalid number");
//        }
//
//        /*
//        4) Ask user to enter year
//        Type java code by using if-else if() statement.
//        Write a program to check if a year is leap year or not.
//        if the year is divisible by 100 then it must be divisible by 400.
//        If a year is not divisible by 100 then it must be divisible by 4.
//         */

        System.out.println("Enter a year");
        int year = scan.nextInt();

        if((year%100) == 0 && (year%400) == 0){
            System.out.println("Leap year");
        }else if((year%100) != 0 && ((year%4) == 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }

        /*
        Ask user to enter annual salary, if the salary is more than or equal
        to $80.000 output will be “I accept the offer”, if the salary is between
        $60.000 and $80.000 out put will be “I'd like to negotiate to increase”,
        otherwise output will be “I do not accept the offer.”
         */
        System.out.println("Enter your annual salary please");
        int salary = scan.nextInt();

        if(salary>= 80000){
            System.out.println("I accept the offer");
        }else if(salary>=60000){
            System.out.println("I'd like negotiate to increase");
        }else {
            System.out.println("I do not accept the offer");
        }










    }
}
