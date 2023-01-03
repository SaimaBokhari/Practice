package practicewithmssara04;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_Arrays_MinMaxValue {
    public static void main(String[] args) {

        /*
        Type code to print the sum of the minimum and maximum value of an integer.

         */

        int arr[] = {23, 12, 34, 10, 78, 19};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int minValue = arr[0];
        int maxValue = arr[arr.length-1];
        System.out.println(minValue + maxValue);

        /*
        Create an Array and first take the number of the elements and then print them
        on the console.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int numOfEmployees = input.nextInt();

        String names[] = new String[numOfEmployees];  // to create array for the given number
        System.out.println(Arrays.toString(names));

        for (int i=0; i<numOfEmployees; i++){
            System.out.println("Enter the employee's name. To stop, press 'Q'." );
            String employeeName = input.next();
            if(!employeeName.equalsIgnoreCase("Q")) {
                names[i] = employeeName;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(names));

        /* Note: to make the message more dynamic, give the option of stop using if condition.
          System.out.println("Enter" + (i+1) + "employee's name. To stop press 'q'. " );
         */





















    }
}
