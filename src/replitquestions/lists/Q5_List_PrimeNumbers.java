package replitquestions.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q5_List_PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
       int givenNum = input.nextInt();

       // Yasin' solution
        int idx=0;

        int result[]=new int[10];
        for (int i=givenNum+1;i<Integer.MAX_VALUE;i++){
            if (idx<10){
                int counter=0;
                for (int j=2;j<i;j++){
                    if (i%j==0){
                        counter++;
                        break;
                    }
                }
                if (counter==0){
                    result[idx]=i;
                    idx++;
                }
            }
        }
        System.out.println(Arrays.toString(result));


        // Mevlut's solution:

        int num = 5;
        int counter=0;
        int count = 0;
        do {
            num++;
            for (int i=1;i<=num;i++){
                if (num%i == 0){
                    counter++;
                }
            }
            if (counter == 2){
                System.out.print(num + " ");
                count++;
            }
            counter=0;
        }while (count<10);


    }




}
