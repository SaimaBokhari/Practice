package replitquestions.ifswitchternary;

import java.util.Scanner;

public class Q6_Ternary {
    public static void main(String[] args) {
        /*
        Ask user to type a name, the length of name should be 3.
        Then check if the name has same characters.

If the String has same characters, Print “String has duplicate characters”
Else, Print “String has unique characters”

Please use ternary.
Input :
ala

OutPut:
String has duplicate characters

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.next();

        // int nameLength = 3;
        String idx = name.substring(0,1);
        System.out.println(idx);

        int i = 0;

        String name1 = name.length()==3 ? name.indexOf(idx) != name.lastIndexOf(idx) ?
                "String has duplicate characters" : "String has unique characters" : "Name is too long";
        System.out.println(name1);



    }
}
