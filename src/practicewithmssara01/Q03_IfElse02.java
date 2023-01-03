package practicewithmssara01;

import java.util.Scanner;

public class Q03_IfElse02 {
    public static void main(String[] args) {

        /*Type a code, get age from the user and decide which stage on it.
         0-4 => baby
         5-12 => child
         13-20 => teenager
         21-30 => adult
         else (not expected age)
         */

        // Step 1 Create Scanner object
        Scanner input = new Scanner(System.in);
        // Step 2 Send message to the user
        System.out.println("Enter your age, please");
        // Step 3 Create a container with appropriate data type
        int age = input.nextInt();
        // Step 4 create the if-else code

        if(age>=0 && age<=4){
            System.out.println("baby");
        }else if(age>=5 && age<=12){
            System.out.println("child");
        }else if (age>=13 && age<=20){
            System.out.println("teenager");
        }else if (age>=21 && age<=30){
            System.out.println("adult");
        }else{
            System.out.println("not expected age");
        }



    }
}
