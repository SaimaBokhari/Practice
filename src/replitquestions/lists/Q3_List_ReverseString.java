package replitquestions.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q3_List_ReverseString {
    /*
    Get a sentence from the user. Accept the sentence received from the user as a parameter,
    Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = input.nextLine();

//        List<String> str = Arrays.asList(sentence);
//        System.out.println(str);

        String rev_str = reverse_sentence(str);
        System.out.println( rev_str);

    }

    public static String reverse_sentence(String str){

        if (str.isEmpty()) {
            return str;
        } else {
            char ch = str.charAt(0);
            return reverse_sentence(str.substring(1)) + ch;
        }
    }
}
