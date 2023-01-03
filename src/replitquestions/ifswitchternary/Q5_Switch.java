package replitquestions.ifswitchternary;

import java.util.Scanner;

public class Q5_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        byte month = scan.nextByte();

        System.out.println("Enter the year");
        int year = scan.nextInt();

        int numDays = 0;
        String monthName= "";

        switch(month){
            case 1: monthName="January";
                numDays = 31;
                break;
            case 3: monthName="March";
                numDays = 31;
                break;
            case 5: monthName="May";
                numDays = 31;
                break;
            case 7: monthName="July";
                numDays = 31;
                break;
            case 8: monthName="August";
                numDays = 31;
                break;
            case 10: monthName="October";
                numDays = 31;
                break;
            case 12: monthName="December";
                numDays = 31;
                break;
            case 4: monthName="April";
                numDays = 30;
                break;
            case 6: monthName="June";
                numDays = 30;
                break;
            case 9: monthName="September";
                numDays = 30;
                break;
            case 11: monthName="November";
                numDays = 30;
                break;
            case 2: monthName="February";
                if(((year%4==0) && !(year%100==0)) || (year%400==0)){
                    numDays=29;
                }else{
                    numDays=28;
                }
                break;
            default:
                System.out.println("Invalid number of month");
                break;
        }
        System.out.println(monthName +" " + year + " "+"has" +" " + numDays + " days.");


    }
}
