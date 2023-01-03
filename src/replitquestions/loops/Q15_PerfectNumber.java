package replitquestions.loops;

public class Q15_PerfectNumber {
    /*
    Write java code checking the number is Perfect number or not.

* Any number can be a Java Perfect Number if the sum of its positive divisors
excluding the number itself is equal to that number.

Input :6
Output:6 is Perfect Number
Input :7
Output:7 is not Perfect Number


     */
    public static void main(String[] args) {

        int n = 6;
        if (isPerfect(n))
            System.out.println(n + " is a perfect number");
        else
            System.out.println(
                    n + " is not a perfect number");
    }

    static boolean isPerfect(int n) {
        if (n == 1)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    sum += i;
                } else {
                    sum += i + (n / i);
                }
            }

        }
        if (sum == n) {
            return true;
        }else {
            return false;
        }
    }


}



//        // 1 is not a perfect number
//        if (n == 1)
//            return false;
//
//        // sum will store the sum of proper divisors
//        // As 1 is a proper divisor for all numbers
//        // initialised sum with 1
//        int sum = 1;
//
//        // Looping through the numbers to check if they are
//        // divisors or not
//        for (int i = 2; i * i <= n; i++) {
//
//            if (n % i == 0) {
//
//                // n is a perfect square
//                // let's take 25
//                // we need to add 5 only once
//                // sum += i + n / i will add it twice
//
//                if (i * i == n)
//                    sum += i;
//                else
//                    sum += i + (n / i);
//            }
//        }
//
//        // If sum of divisors is equal to n, then n is a perfect number
//
//        if (sum == n)
//            return true;
//        return false;
//






