package practicewithmssara05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_TernaryPractice {
    public static void main(String[] args) {
        /*
        Example: 1
        Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        for odd integers and print it on the console by using ternary.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");

        int num = input.nextInt();

        System.out.println(num%2==0 ? "Even" : num+3);

        System.out.println("===================");
     /*
     Example: 2
         *  Type code to find the common elements between two String Arrays
                * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
      */

        String arr[] = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String brr[] = {"sofia", "brad", "grace", "emily", "hazel"};



        // 1st way:

        List<String> list= new ArrayList<>();

        for(String w: arr){
            for(String u:brr){
                if(w.equalsIgnoreCase(u)){
                    list.add(u);
                }
            }
        }
        System.out.println(list);

        // 2nd way:

        for (int i =0; i<arr.length; i++){
            for (int k=0; k<brr.length; k++){
                if (arr[i].equalsIgnoreCase(brr[k])){
                    System.out.print(arr[i]);
                }
            }
        }










    }
}
