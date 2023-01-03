package switchstatementspptslide;

import java.util.Scanner;

public class SwitchQPg82 {
    public static void main(String[] args) {

        /*If the user pressed 1, 2, 3 the program will print the number that is pressed;
        otherwise, program will print "Not allowed".

         */

        Scanner scan = new Scanner(System.in);

//        int a = 1, b = 2, c = 3;
//        int result = scan.nextInt();
//        switch (result) {
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            case 4:
//                System.out.println("Not allowed");
//        }

        // 2nd way:
        System.out.println("Press 1,2, or 3");
        int button = scan.nextInt();

        switch (button) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Not allowed");
        }

/*
Write a Java program user will choose answer among A, B, C, or D.
If the answer is true, output will be “True.” If the answer is false, output will be
“False”. Correct answer is ‘C’ for the multiple option question.
 */
        System.out.println("Choose the correct answer from A,B,C D");
        char ans = scan.next().charAt(0);

        //1st way: if statement

        if (ans == 'A') {
            System.out.println("False");
        } else if (ans == 'B') {
            System.out.println("False");
        } else if (ans == 'C') {
            System.out.println("True");
        } else if (ans == 'B') {
            System.out.println("False");
        } else {
            System.out.println("Invalid Answer");
        }
        //2nd way: switch statement

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer among A, B, C, D, please");
        String answer = input.next().toLowerCase();

        switch (answer) {
            case "a":
            case "b":
            case "d":
                System.out.println("False");
                break;
            case "c":
                System.out.println("True");
                break;
            default:
                System.out.println("Invalid Answer");

     /*
         Type java code by using switch statement.
          A school has following rules for grading system:
          1. For 50 - C 2. For 80 - B. 4. For 100 - A
          Ask user to enter marks and print the corresponding grade.
         */
                System.out.println("Enter your marks please");
                int marks = scan.nextInt();

                if (marks == 50) {
                    System.out.println("C");
                } else if (marks <= 80) {
                    System.out.println("B");
                } else if (marks <= 100) {
                    System.out.println("A");
                } else {
                    System.out.println("Invalid numbers");
                }

                //2nd way:
                System.out.println("Chooser your answer among A, B, C, D, please");
                String answer1 = input.next().toLowerCase();

                switch (answer1) {
                    case "marks==50":
                        System.out.println("C");
                    case "marks<=80":
                        System.out.println("B");
                        break;
                    case "marks<=100":
                        System.out.println("TA");
                        break;
                    default:
                        System.out.println("Invalid Answer");
                }

        /*
        4) Ask user to enter one of the ‘U’, ’S’, and ‘A’.
        Then type a program by using “switch statement” to print “United” for ‘U’
        ”States” for ’S’, and “America” for ‘A’
         */
                System.out.println("Choose among U, S or A");
                String answer2 = scan.next();
                switch (answer2){
                    case "U":
                        System.out.println("United");
                        break;
                    case "S":
                        System.out.println("States");
                        break;
                    case "A":
                        System.out.println("America");
                }



        }

    }
}