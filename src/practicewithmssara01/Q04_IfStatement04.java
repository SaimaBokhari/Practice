package practicewithmssara01;

import java.util.Scanner;

public class Q04_IfStatement04 {

    public static void main(String[] args) {

        //Type a code to print its season after getting a month from the user.//
        // Step 1: Create Scanner object
        Scanner scan = new Scanner(System.in);

        // Step 2: Give message to the user
        System.out.println("Enter the name of the month");

        // Step 3: Create a container for the input (with appropriate data type)
        String month = scan.next().toLowerCase();

        // Step 4: Create If code

        if(month.equals("march") || month.equals("april") || month.equals("may")){
            System.out.println("Spring");
        }else if(month.equals("june") || month.equals("july") || month.equals("august")){
            System.out.println("Summer");
        }else if (month.equals("september") || month.equals("october") || month.equals("november")){
            System.out.println("Autumn");
        }else if(month.equals("december") || month.equals("january") || month.equals("february")){ //january-JANUARY-JANuary
            System.out.println("Winter");
        }else {
            System.out.println("Enter a valid month name");
        }

        // what if the user enters the data different from our code e.g. lowercase or uppercase.
        // JanuaRy/ january/ JaNUary etc.
        // To solve this problem, we need to change the container .. method part .. and convert
        // it from String month = scan.next() to String month = scan.next().toLowerCase() and Java will find the right match. Fo this make sure
        // our code also has all lowercase.





    }
}
