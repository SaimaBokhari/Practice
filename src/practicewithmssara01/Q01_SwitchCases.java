package practicewithmssara01;

import java.util.Scanner;

public class Q01_SwitchCases {
    public static void main(String[] args) {

        /*
        Ask user to enter a character. If it is 'vowel', print
        vowel; if not print 'not vowel'. (a,e,i,o,u)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        char vowel = input.next().toLowerCase().charAt(0);

        switch(vowel){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel");
                break;
            case 'b':
            case 'c':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("It's not a vowel");
                break;
            default:
                System.out.println("It's not a letter.");
        }

















    }
}
