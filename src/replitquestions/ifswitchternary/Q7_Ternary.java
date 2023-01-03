package replitquestions.ifswitchternary;

import java.util.Scanner;

public class Q7_Ternary {
    public static void main(String[] args) {
        /*
        Create 2 words : name1 and name2
if the name1 has even numbers of characters,
then insert the second word in the middle of the first name

if the first word has odd numbers
Then print the “Name2 cannot be inserted in the name1”

e.g:
name1= mehmet
name2= ahmet
Print ==> mehahmetmet
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String name1 = input.next();

        System.out.println("Enter second name");
        String name2 = input.next();

        int idx= name1.length()/2;


        String result = name1.length()%2==0? name1.substring(0, idx) + name2 + name1.substring(idx) : "Name2 cannot be inserted in the name1";
        System.out.println(result);






    }
}
