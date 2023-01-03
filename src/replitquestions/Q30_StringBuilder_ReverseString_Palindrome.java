package replitquestions;

import java.util.Scanner;

public class Q30_StringBuilder_ReverseString_Palindrome {
    /*
    Write a java program which accept a sentence as parameter, then reverses sentence
    by using StringBuilder and checks if sentence is palindrome or not
    (without case sensitivity).Use StringBuilder.


Input :

I love Java.

Output:

Reversed sentence : avaJ evol I.
It is not a palindrome"
     */

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("I love Java");
        StringBuilder p = new StringBuilder( s.reverse());
        System.out.println("Reversed sentence: " + p);


        String rev = new String();

        for (int i = s.length()-1; i >= 0; i--) {

            rev = rev + s.charAt(i);
        }

        // Checking if both the strings are equal
        if (s.equals(rev)) {
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String str = input.nextLine();
        final int ASCII_SIZE = 256;

        int count [] = new int[ASCII_SIZE];

        int length = str.length();
        for(int i=0; i<length; i++){
            count[str.charAt(i)]++;

        }

        int max = -1;
        char result = ' ';

        for(int i=0; i<length; i++ ){
            if(max<count[str.charAt(i)]){
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println("maximum occurring character is : " + result);











    }
}
