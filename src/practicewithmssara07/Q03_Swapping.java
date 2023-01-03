package practicewithmssara07;

import java.util.Scanner;

public class Q03_Swapping {
    public static void main(String[] args) {

        //Ask user to enter 2 numbers then swap them
        // a= 12; and b= 13; ===> a=13; and b=12

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number");
            double a = input.nextDouble();

            System.out.println("Enter second number");
            double b = input.nextDouble();

            System.out.println("Before swapping:" + a + " " + b);

            double temp = 0;
            temp = b;
            b = a;
            a = temp;
            System.out.println("After swapping:" + a + " " + b);
        }catch(Exception e){
            System.out.println("Something went wrong while swapping");
        }







    }
}
