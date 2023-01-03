package replitquestions.arrays;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a digit");

        String number, digit1, conc="";
        int sum2=0;

        number=scan.next();
        for (int i=0;i<number.length();i++) {         //here i looped each one. i looped through the length of the number/ this gives me a right of pass to go inside the number
            digit1 = number.substring(i, i + 1);            //here i went inside each number and took it to pieces so i can use it to add individually
            conc = conc + digit1;                   //now each one I took apart I am adding it to each other. Here i concatenated them. because so far im getting strings as integers only
            //-so i am concatenating them. to be able to add them i need to turn it into integers.
            System.out.println("==Concatenation==");
            System.out.println(conc);//I have not turned them into integers yet so this conc is concatenating it for now
            System.out.println("Below is where I have added the integers");
            int add = Integer.valueOf(digit1);
            sum2 = sum2 + add;
            System.out.println(sum2);
        }

    }
}
