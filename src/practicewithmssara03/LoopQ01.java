package practicewithmssara03;

import java.util.Scanner;

public class LoopQ01 {

    public static void main(String[] args) {


        /*
        Q.1) Type code to reverse a string.
          Tom Hanks==> sknaH moT
         */

        // 1st way:
        String s = "Tom Hanks";
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        System.out.println(reversed);


//       2nd way:
//        String str="Tom Hanks";
//        String reversed="";
//        for (int i=str.length()-1;i>-1;i--){
//            String s=str.substring(i,i+1);
//            reversed=reversed+s;
//        }
//        System.out.print(reversed);

        /*
        Q.2)  Get the initial from full name. Middle name is out of scope.
        Tom Hanks ==> TH
         */

        String name = "   Tom Hanks   ";
        // trim () removes the spaces just before and after the main string.
        // It doesn't touch the middle spaces.
        // substring(startingIndex, endIndex) method is used to get a specific part of a string.
        // starting index is inclusive, ending index is exclusive.

        String initialFirstName = name.trim().substring(0, 1).toUpperCase();
        String initialLastName = name.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println(initialFirstName + initialLastName);


        // split () with speech marks (and space in the middle) will cut the string
        // where it finds the space. After splitting , Java treats the given string
        // as 2 strings in this case or however many spaces it finds.

        /*
        Q.3) Username is "admin", Password is "pwd123"
        Ask user to enter username and password
        User should see "Enter your username and password" message
        If user enters correct credentials, he should get "You are in your account!" message.
        Otherwise, he should see "Enter your username and password" message 3 times.
        After 3 times he should get "Your account is blocked" message.
        */

        Scanner input = new Scanner(System.in);

        int counter = 0;

        //1st: Teacher's way

        do {
            if (counter == 3) {
                System.out.println("Your account is blocked");
                break;
            }

            System.out.println("Enter your username");
            String userName = input.next();

            System.out.println("Enter your password");
            String password = input.next();

            counter++;

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account");
                break;
            }
        }while (true);


//       // 2nd way:


        do {
            if (counter == 3) {
                System.out.println("Your account is blocked");
                  break;
           }
                System.out.println("Enter your username");
                String username = input.next();

                System.out.println("Enter your password");
                String pwd = input.next();

                counter++;

                if (username.equals("admin") && pwd.equals("pwd123")) {
                    System.out.println("You are in your account!");
                    break;
                }

            }
            while (counter < 4) ;
















    }
}

