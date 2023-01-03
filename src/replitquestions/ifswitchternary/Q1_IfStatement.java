package replitquestions.ifswitchternary;

import java.util.Scanner;

public class Q1_IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg");
        double weight = input.nextDouble();

        System.out.println("Enter your height in m");
        double height = input.nextDouble();

        double bmi= weight/(height*height);
        System.out.println("Your BMI is: " + bmi);

        if(bmi<=0){
            System.out.println("Invalid data");
        }else if(bmi<18.5){
            System.out.println("You are weak");
        }else if(bmi<24.9 && bmi>=18.5){
            System.out.println("Your weight is ideal");
        }else if(bmi<29.9 && bmi >=25){
            System.out.println("You are fat");
        }else if(bmi>=30){
            System.out.println("You are obese");
        }
    }
}
