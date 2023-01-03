package replitquestions.arrays;

import java.util.Scanner;

public class Q20_Arrays_ReverseSentence {
    public static void main(String[] args) {
        /*
        Write a Java program that reverse a sentence by using Array
        (with all spaces and special characters).

Input  : Coding is greate.

Output : .etaerg si gnidoC
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        String rev_str = reverse_sentence(str);
        System.out.println( rev_str);

        Q20_Arrays_ReverseSentence obj = new Q20_Arrays_ReverseSentence();
        obj.reverseString(str);


    }
    // 1st way
    public static String reverse_sentence(String str){

    if (str.isEmpty()) {
        return str;
    } else {
        char ch = str.charAt(0);
        return reverse_sentence(str.substring(1)) + ch;
        }
    }

    // 2nd way:
    void reverseString(String str) {
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }





}
