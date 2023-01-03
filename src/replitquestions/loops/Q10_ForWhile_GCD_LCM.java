package replitquestions.loops;

import java.util.Scanner;

public class Q10_ForWhile_GCD_LCM {
    /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in );
        System.out.println("Enter the first number");
        int n1 = input.nextInt();

        System.out.println("Enter second number");
        int n2 = input.nextInt();

        int gcd= 1;
        int i =1;

        while(i<n1 && i<n2){
            if(n1%i ==0 && n2%i==0){
                gcd=i;
            }
            i++;
        }
        System.out.println("The GCD of " + " " + n1 + " and " + n2 + " is: " + gcd);

        int lcm = (n1 * n2) / gcd;
        System.out.println("The LCM of " +" " + n1 +" and " + n2 + " is: " + lcm);




//        for (int i = 1; i <= n1 && i <= n2; ++i) {
//            if (n1 % i == 0 && n2 % i == 0)
//                gcd = i;
//        }
//
//        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);



//        while(n1 != n2) {
//
//            if(n1 > n2) {
//                n1 -= n2;
//                System.out.println(n1);
//            }
//
//            else {
//                n2 -= n1;
//                System.out.println(n2);
//            }
//        }
//
//        System.out.println("GCD: " + n1);
//




    }
}
