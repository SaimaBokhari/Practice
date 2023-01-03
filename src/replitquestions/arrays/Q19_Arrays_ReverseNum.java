package replitquestions.arrays;

import java.util.Arrays;

public class Q19_Arrays_ReverseNum {
    public static void main(String[] args) {
        /*
        Write a return method to reverse number.

Input  : 12345

Output : 54321
         */

        int num = 12345;
        int reverse = 0;

        while(num !=0){
            int remainder = num%10;
            num =  num/10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);

        // in Arrays

        int [] arr = {1,2,3,4,5};
        int [] brr = new int[arr.length];

        int idx = arr.length-1;
        for(int w:arr ){
            brr[idx] = w;
            idx--;
        }
        System.out.println(Arrays.toString(brr));











    }
}
