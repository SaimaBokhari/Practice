package replitquestions.ifswitchternary;

import java.util.Scanner;

public class Q8_Ternary {
    public static void main(String[] args) {
        /*
         Ask user for a string and print a new string made of 3 copies of
         the last 2 letters.
         The strings length will be at least 2.

 Sample:

INPUT       : Mustafa
OUTPUT      : fafafa
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String secondLastChar = word.substring(word.length()-2,word.length()-1);
        String copiedWord = secondLastChar+word.substring(word.length()-1);


       String result = word.length()>2 ? copiedWord+copiedWord+copiedWord : "Try again!";
        System.out.println(result);

    }
}
