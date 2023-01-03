package pptpracticeifstatements;

import java.util.Scanner;

public class IfStatementQs {
    public static void main(String[] args) {

        /*
        1) Type java code, if an integer is even, output will be “The integer is even”.
        If the integer is odd, output will be “The integer is odd”.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer please ");
        int num = input.nextInt();


        if(num%2 == 0){
            System.out.println("The integer is even");
        }else{
            System.out.println("The integer is odd");
        }

        /*
        2) Type java code by using if statement. When you enter the initial of the day of a week,
        output should be all possible names of the days.
        For example; if the initial is ’S’ output should be “Saturday or Sunday”
         */


        System.out.println("Enter the initial of the day");
        String initialOfTheDay = input.next();
        initialOfTheDay.substring(0,1).toUpperCase();

        if(initialOfTheDay.equals("s")){
            System.out.println("saturday" + "or" + "sunday");
        }else if(initialOfTheDay.equals("m")){
            System.out.println("monday");
        }else if(initialOfTheDay.equals("t")) {
            System.out.println("tuesday" + "or" + "thursday");
        }else if(initialOfTheDay.equals("w")) {
            System.out.println("wednesday");
        }else if(initialOfTheDay.equals("f")) {
            System.out.println("friday");
        }else{
            System.out.println("Invalid day of the week");
        }

        /*
        3) Type java code by using if statement. When you enter the name of the day of a week,
        output will be “Weekday” or “Weekend day” according to the name of the day.
         */

        System.out.println("Enter the name of the day");
        String dayName = input.next().toLowerCase();

//        if(dayName.equals("saturday")) || (dayName.equals("sunday"){
//            System.out.println("Weekend");
//        }else if(dayName.equals("monday")) || (dayName.equals("tuesday")) || (dayName.equals("wednesday")) ||
//                (dayName.equals("thursday")) || (dayName.equals("friday")){
//            System.out.println("Weekday");
//        }else{
//                System.out.println("Invalid name of the day");
//            }
        /*
        Note: 2 scenarios to consider a) what if user types moNDAY b) is there any way to
         simplify this code; it seems too long and complicated.
         Solutions: a) use equalsIgnoreCase() from the dropdown list b) take the code from inside the if(), create
         a boolean container and put the if statements inside ()
         e.g. boolean isWeekday = dayName equalsIgnoreCase(another String "Monday") and create simple if
         statements, sout for boolean container.
         */

        boolean isWeekday = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");
        boolean isWeekend = dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Saturday");


        /* 4) Ask user to enter the values of length and width of a rectangle,
        then check if it is square or not.
         */
        System.out.println("Enter the length of the rectangle");
        int l = input.nextInt();

        System.out.println("Enter the width of the rectangle");
        int w = input.nextInt();

        if(l == w){
            System.out.println("It is a square");
        }else{
            System.out.println("It's not a square");
        }



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
