package practicewithmssara02;

public class Q01_Punctuationmarks {
    public static void main(String[] args) {

        /*
    Type a code to find the number of punctuation marks used in a
    String.
     */

        String str= "Wow!... Ali is 13 years old,and he is a university student.";

        int totalNumOfChar = str.length();
        System.out.println(totalNumOfChar); //59

        String strWithoutPunct = str.replaceAll("\\p{Punct}", "");
        System.out.println(strWithoutPunct.length());  //53
        System.out.println(totalNumOfChar - strWithoutPunct.length());

        /* regular expression for all punctuations can be typed
        "\\p" ==> by replaceAll() punctuation will be replaced with nothing.
        so we can find the number of characters other than punctuation in a given
        statement.
         */

        // easier and more efficient way:

        System.out.println(str.replaceAll("\\P{Punct}", "").length());









    }

}
