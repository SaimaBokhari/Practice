package pptslidepractice;

import java.util.Scanner;

public class ModulusOperatorQ {
    public static void main(String[] args) {

        // example:

//        int num1 = 45;
//        int num2 = 13;
//        int remainder = num1 % num2;
//        System.out.println("Remainder:" + remainder);

        /*
        1) Type a program like;
Ask user to enter two integer values, the first will be greater than the second.
The remainder when you divide the first by the second will be the width,
and the sum of the two numbers will be the length of a rectangle.
Then calculate the area and the perimeter of the rectangle, and print them
on the console.
         */
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the value of x");
//        int x = input.nextInt();
//
//        System.out.println("Enter the value of y");
//        int y = input.nextInt();
//
//        int remainder = x%y;
//
//        System.out.println("width of the rectangle is:" + remainder);
//
//        System.out.println("length of the rectangle is:" + (x+y));
//
//        /*
//        2) Ask user to enter two integer values. Write a Java Program to swap
//        two numbers by using the third variable.
//         */
//
        int a= 5, b=6;
//        //1st way:
//
//         a=b;
//         b=a;
//        System.out.println("a:" + a);
//        System.out.println("b:" + b);
//        /* in this case, result of a is swapped but not b, b is still 6. when we say a=b,
//        b takes the new value(6) and assigns it to a when we print b=a.
//         */
//
//        //2nd way: create a temporary int container (third variable) to store the assigned value of a and
//        // then use that temporary container to assign new value to b.
        // This way uses one bit less memory as compared to 1st way
//
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        /* 3rd Way: XOR
        We haven't learned that yet. but that's even more memory efficient.

         */

        /*
        3) Ask user to enter two integer values. Write a Java Program
        to swap two numbers without using the third variable.
         */







    }
}
