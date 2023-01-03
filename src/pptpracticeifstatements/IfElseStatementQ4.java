package pptpracticeifstatements;

import java.lang.module.FindException;
import java.util.Scanner;

public class IfElseStatementQ4 {
    public static void main(String[] args) {

        /*
        4) Ask user ta enter any name of the week, then get second ,fourth,
        and sixth letter of the day name and print them on the console,
        in the same line.
        For example; if the user enters “Monday” output will be “ody”
         */
        Scanner input = new Scanner(System.in);

        //1st way:

//        System.out.println("Enter the name of the day");
//        String dayName = input.next();
//
//        if(dayName.equalsIgnoreCase("Monday")){
//            System.out.println("ody");
//        }else if(dayName.equalsIgnoreCase("Tuesday")){
//            System.out.println("usa");
//        }else if(dayName.equalsIgnoreCase("Wednesday")){
//            System.out.println("end");
//        }else if(dayName.equalsIgnoreCase("Thursday")){
//            System.out.println("hrd");
//        }else if(dayName.equalsIgnoreCase("Friday")){
//            System.out.println("rdy");
//        }else if(dayName.equalsIgnoreCase("Saturday")){
//            System.out.println("aud");
//        }else if(dayName.equalsIgnoreCase("Sunday")){
//            System.out.println("udy");
//        }else{
//            System.out.println("invalid day name");
//        }

        // 2nd way: (more efficient and preferable)

//        System.out.println("Please enter a day.");
//        String nameOfDay = input.next();
//
//        System.out.println(nameOfDay.substring(0, 1).toUpperCase());
//
//        char char2 = nameOfDay.charAt(1);
//        char char4 = nameOfDay.charAt(3);
//        char char6 = nameOfDay.charAt(5);
//
//        System.out.println("The second, fourth, and sixth letters are " +char2 + char4 + char6 + " in order.");


        /*
        5) Type java code by using if-else statement,
        if the password is “JavaLearner”, output will be “The password is true”.
        Otherwise, output will be “The password is false”.
         */

//        System.out.println("Enter your password");
//        String psw = input.next();
//        if(psw.equals("JavaLearner")){
//            System.out.println("The password is true");
//        }else{
//            System.out.println("The password is false");
//        }

        /*
        6)  Type java code by using if-else statement,
        Write a program to print absolute value of a number entered by user.
        Absolute Value: If the number is positive or zero return the number itself
        If the number is negative return the number after multiplying by -1
         */

//        System.out.println("Enter a number please");
//        int num = input.nextInt();
//        if(num>= 0){
//            System.out.println(num);
//        }else if (num<0){
//            System.out.println(num*-1);
//        }


        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your surname");
        String surName = input.next();

        System.out.println("Enter your card number");
       String num = input.next();


        String firstNameSym = firstName.substring(1, firstName.length()).replaceAll("[a-z]","*");
        String firstNameCap = firstName.substring(0,1).toUpperCase();
        System.out.print(firstNameCap+firstNameSym + " ");


        String surNameSym = surName.substring(1, surName.length()).replaceAll("[a-z]","*");
        String surNameCap = surName.substring(0,1).toUpperCase();
        System.out.println (surNameCap+surNameSym);

       String firstDigits = num.substring(0, num.length()-4);
       String lastDigits = num.substring(num.length()-4,num.length());


         if(num.replaceAll("\\s", "").length()>=16){
            System.out.println(firstDigits.replaceAll("[0-9]", "*")+ lastDigits);
        }else{
            System.out.println("Invalid Password");
        }




    }
}
