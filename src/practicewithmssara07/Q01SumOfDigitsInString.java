package practicewithmssara07;

import java.util.Scanner;

public class Q01SumOfDigitsInString {
    /*
     Create a method that accepts a String as parameter
     and finds the sum of digits in that String.

     Example:
     input : J4\/4 1$ 34$¥ ==> 4+4+1+3+4=16
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        // call the method:
        sumOfDigits(str);

    }

//    public static void sumOfDigits(String str ){
//        int sum = 0;
//        for(int i=0; i<str.length();i++){
//            if(Character.isDigit(str.charAt(i))){
//                sum+= Integer.valueOf(str.substring(i,i+1));
//            }
//        }
//        System.out.println("sum of digits: " + sum);
//    }

    // how to apply try-catch block for the above question.

    public static void sumOfDigits(String str ) {
        int sum = 0;

        try {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    sum += Integer.valueOf("" + str.charAt(i));   // another possible code: sum += Character.getNumericValue(str.charAt(i));
                }
            }
        } catch (Exception e) {
            System.out.println("There's been an issue while summing up" + e.getMessage());

        }System.out.println("sum of digits: " + sum);
    }

// Exception is the grandparent of all run time and compile time exceptions
// IDE ==> Integration Development Environment...a compiler

    // Mevlut's method:

//    public static void main(String[] args) {
//        String str = "12587po";
//        System.out.println(sumOfDigits(str));
//    }
//    public static  int sumOfDigits(String s){
//        int result = 0;
//        s = s.replaceAll("[^0-9]","");
//        for (int i =0;i<s.length();i++){
//            String p = s.substring(i,i+1);
//            result = result + Integer.valueOf(p);
//        }
//        return result;
//    }

}
