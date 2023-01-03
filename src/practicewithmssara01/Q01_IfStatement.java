package practicewithmssara01;

import java.util.Scanner;

public class Q01_IfStatement {
    public static void main(String[] args) {

        /*
        If the score is less than 50 then you will fail
        If the score is greater than 50 then you will pass,

        If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
        here only one condition will be checked.

        if the first part is true then the first action will occur but
        if the first condition is false then the second action will occur,this is the logic of "if else".
                */

        // Step 1: Create object from Scanner class

        Scanner input = new Scanner(System.in);

        // Step 2: Send message to the user. Ask user to enter his/her score
        System.out.println("Enter your grade");

        // Step 3: Create a container with the appropriate data type
        int score = input.nextInt();

        // Step 4: Type code condition with If statement

        // 1st way: with multiple if statements If else

        if(score<50){
            System.out.println("You failed");
        }
        if(score>=50){
            System.out.println("You passed");
        }

        // 2.way: If else statement

        if(score > 50){
            System.out.println("You passed");
        }else {
            System.out.println("You failed");

        }
        // 3 way:

        if(score<50){
            System.out.println("You failed");
        }else if((score>=50) ||(score<=100)) {
            System.out.println("You passed");
        }else if((score<=0) ||(score>100)){
            System.out.println("Invalid score");
        }
        /* Note: || "OR" Operator will not give us the correct answer "Invalid" even
        if we input number greater than 100 or less, you still get passed. The problem
        is || Operator checks both conditions, if it gets even one condition true, the
        result printed on console will be true. So if we input 120, in the second
        condition 120>50 is true, operator will consider it true even though 120<100.
        so we need to add && Operator in the second line.
         */

        if(score<50){
            System.out.println("You failed");
        }else if((score>=50) && (score<=100)) {
            System.out.println("You passed");
        }else if((score<=0) || (score>100)){
            System.out.println("Invalid score");
        }

    }

}

