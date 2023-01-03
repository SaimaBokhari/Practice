package replitquestions.loops;

public class Q18_SumOfNaturalNumbers {
    public static void main(String[] args) {
        /*

Write a Program to find the sum of natural numbers from 1 to 100.


OUTPUT 		:   Sum of Natural Numbers 5050


*/
        // while loop
        int sum = 0;
        int num = 100;
        int i = 1;
        while(i<num){
            sum=num*(num+1)/2;
            i++;
        }
        System.out.println(sum);


        //method call
//        int n=100;
//        System.out.println(findSum(n));

    }

//    public static int findSum(int n){
//        return n * (n+1)/2;
//    }






}
