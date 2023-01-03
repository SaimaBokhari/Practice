package mssarasassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
         * create a method accepts a name as parameter and prints the name as a char array

         * (do not use toCharArray() method)

         * Input : John
         * Output : [J, o, h, n]
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");

        String name = scan.next();

        String nameAtChar[] = name.split("");
        System.out.println(Arrays.toString(nameAtChar));




    }
}
