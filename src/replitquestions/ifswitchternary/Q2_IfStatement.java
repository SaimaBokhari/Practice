package replitquestions.ifswitchternary;

import java.util.Scanner;

public class Q2_IfStatement {

    /*
    Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN  : **** **** **** 1478

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your surname");
        String surName = input.next();

        System.out.println("Enter your card number");
        String ccNum = input.next();


        String firstNameSym = firstName.substring(1, firstName.length()).replaceAll("[a-z]","*");
        String firstNameCap = firstName.substring(0,1).toUpperCase();
        System.out.print(firstNameCap+firstNameSym + " ");


        String surNameSym = surName.substring(1, surName.length()).replaceAll("[a-z]","*");
        String surNameCap = surName.substring(0,1).toUpperCase();
        System.out.println (surNameCap+surNameSym);

        String result="";
        int idx=1;
        for (int i = 0; i < ccNum.length(); i++) {
            if (idx%4==0 && idx<13){
                result+="* ";
                idx++;
            }else if (idx<13){
                result+="*";
                idx++;
            }else {
                result+=ccNum.substring(i,i+1);
                idx++;
           }

        }
        System.out.println(result);

    }
}
