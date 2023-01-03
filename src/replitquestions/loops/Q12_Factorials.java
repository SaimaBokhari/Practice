package replitquestions.loops;

public class Q12_Factorials {
    public static void main(String[] args) {

/*
Write a return method that accepts an integer as input and calculates factorial
and prints like output.

Input : 6

Output: 6!=6*5*4*3*2*1=720
 */

        int number = 6;
        int factorial = 1;
        String factString = "";

        for (int count = number; count > 0; count--) {
            factorial = factorial * count;
            if (count == number) {
                factString += count;
            } else {
                factString += " * " + count;
            }
        }

        System.out.println(number+"!=" + factString + "=" + factorial);
        System.out.println();



// Simple factorial method.

//            int num = 6;
//            long factorial = 1;
//            for(int i = 1; i <= num; ++i)
//            {
//                // factorial = factorial * i;
//                factorial *= i;
//                System.out.println(factorial);
//            }
        //System.out.println(factorial);

//        int num = 5, i = 1;
//        long factorial = 1;
//        while(i <= num)
//        {
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);








    }
}
