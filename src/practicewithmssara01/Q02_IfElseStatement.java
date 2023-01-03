package practicewithmssara01;

import java.util.Scanner;

public class Q02_IfElseStatement {
    public static void main(String[] args) {


        /*
        Ask user to enter his weight and height. Calculate body index
        of the user.
        To calculate, use bodymassind = weight / squareofheight
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you height please");
        double height = input.nextDouble();
        double squareHeight = height*height;

        System.out.println("Enter you weight please");
        double weight = input.nextDouble();

        double bmi = weight / squareHeight;
        System.out.println("Your BMI is:" + bmi);

        if(bmi>0 && bmi<18.5){
            System.out.println("You are weak.");
        }else if(bmi>=18.5 && bmi<=25){
            System.out.println("Your weight is ideal.");
        }else if(bmi>25 && bmi<30){
            System.out.println("You are fat.");
        }else if(bmi>=30){
            System.out.println("You are obese.");
        }else{
            System.out.println("Invalid data");
        }
















    }
}
