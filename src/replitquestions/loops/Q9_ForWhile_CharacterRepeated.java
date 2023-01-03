package replitquestions.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9_ForWhile_CharacterRepeated {
    /*
    Ask user to enter a name and a character, then check how many times the character
    is repeated in the name using loops in the name.

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2
     */

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a name");
//        String name = input.nextLine();

//        System.out.println("Enter the character you want to count");
//        char ch1 = input.next().charAt(0);
//
//        int counter = 0;
//        int i = 0;
//
//        while(i<name.length()){
//
//            if (name.charAt(i) == ch1) {
////                System.out.println(ch1);
////                System.out.println(i);
//                counter++;
//            }
//            i++;
//        }
//        System.out.println("Number of "+ch1+ " in the name: " +counter );


//        int num = 438;
//
//        int sum = 0;
//
//        for(int i=0; i<num;i++){
//            sum+= num%10;
//            num/=10;
//        }
//        System.out.println(sum);

        /*
        Given two integers a and b, which can be positive or negative, find the sum of
        all the integers between and including them and return it.
        If the two numbers are equal return a or b.

        Note: a and b are not ordered!

         */

        int a = 3;
        int b = 6;




            /*
            Number of people in the bus
             */
    }


    //1st way:
//    public int GetSum(int a, int b) {
//        return (a + b) * (Math.abs(a - b) + 1) / 2;
//    }
    // 2nd way:
    public int GetSum(int a, int b) {
        return (a==b) ? a : ((Math.abs(b-a)+1)*(b+a)/2);
    }




    public static int countPassengers(ArrayList<int[]> stops) {
        int count = 0;
        for(int[] a: stops)
            count += (a[0]-a[1]);
        return count;
    }

}
