package reviewqpg87;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reviewpg88 {
    public static void main(String[] args) {

        /*
        5) Ask user to enter a word which has 4 letters and output will be inverse of the word.
        For example; if user enters “MARK” output will be “KRAM”
         */

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter a four letter word");
//        String word = scan.nextLine();
//
//        //1st way:
//
//        String firstChar = String.valueOf(word.charAt(0));
//        String secChar = String.valueOf(word.charAt(1));
//       String thirdChar = String.valueOf(word.charAt(2));
//        String lastChar = String.valueOf(word.charAt(word.length()-1));
//        System.out.println(lastChar+thirdChar+secChar+firstChar);
//
//        // 2nd way: easier way
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a 4 letters word, please!");
//        String word1 = input.nextLine();
//
//        String first = word1.substring(0,1);
//        String second = word1.substring(1,2);
//        String third = word1.substring(2,3);
//        String last = word1.substring(word.length()-1);
//
//        System.out.println(last + third + second + first);
//
//        /* 6)
//        Ask user to enter a String and output will be the number of the characters in the String.
//         */
//        System.out.println("Enter your sentence please");
//        String sentence = scan.nextLine();
//
//        int numOfCharacters = sentence.split("").length;
//
//        System.out.println( numOfCharacters);
//
//        /* 7)
//        Ask user to enter password, if the password is okay for the following conditions,
//         output will be “Your password is created successfully.”
//         If the password is not okay for any of the following conditions, Output will be
//          “Enter a new password according to the give conditions”
//          1.First letter must be uppercase
//          2.Last letter must be lowercase
//          3.Password must contain 6 characters
//         */
//
//        System.out.println("Enter your Password");
//        String pwd = scan.nextLine();


       //  boolean pwdInitial = pwd.charAt(0) >= 'A' && pwd.charAt(0)<= 'Z';
       //  boolean pwdLastChar = pwd.charAt(pwd.length()-1) >= 'a' && pwd.charAt(pwd.length()-1)<='z';
       // boolean pwdNumOfChar = pwd.length()==6;

//        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z' &&
//                pwd.charAt(pwd.length() - 1) >= 'a' && pwd.charAt(pwd.length() - 1) <= 'z' &&
//                pwd.length() == 6) {
//            System.out.println("Your password is created successfully");
//        } else {
//            System.out.println("Enter a new password according to the given conditions");
//        }


        /*
        8) Ask user ta enter his/her first name, last name and Social Security Number.
        Then type a program which makes
        a) initials of the first name and the last name in uppercase,
        other characters will be in lowercase.
        b) all characters except last 4 characters of the Social Security Number “ * ”.
        For example; Suleyman Alptekin *****5678
         */

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        System.out.println("Enter your ssn");
        String ssn = scan.nextLine();

//       String result1 = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
//       String result2 = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
//        String result3 = ssn.substring(0,5).replaceAll("[0-9]", "*") + ssn.substring(5);
//
//        String result4 = result1 + result2 +result3;
//        System.out.println(result4);

        //2nd Way:

        System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase()
            + " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase()
            + " " + ssn.substring(0,5).replaceAll("[0-9]","*") + ssn.substring(5));











    }
}
