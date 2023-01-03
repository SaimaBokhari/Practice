package replitquestions.arrays;
import java.util.Scanner;

public class Q26_Arrays_OneArrayAsParameter {
    /*
    Write a method that accepts an array as parameter and returns sum off
    all elements in the array Then print the result in the main method.


Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements to add into the array");
        int num = input.nextInt();
        int[] a = new int[num];
        //System.out.println(Arrays.toString(a));

        System.out.println("Enter " + num + " elements" );
        for(int i=0; i<a.length;i++){
            a[i] = input.nextInt();
        }

        System.out.println(getSum(a));
    }

    public static int getSum(int[] a){
        int sum = 0;
        for(int w: a){
            sum += w;
        }
        return sum;
    }


}
