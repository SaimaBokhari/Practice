package replitquestions.arrays;

import java.util.Arrays;

public class Q23_Arrays_ReturnNameInCharArray {
    /*
   Create a custom return type method accepts a name as parameter and prints the name as a char array.

(do not use toCharArray() method)


Input : John

Output :[J, o, h, n]

    */
    public static void main(String[] args) {

        String str = "John";
        String[] arr =  str.split("");
        System.out.println(Arrays.toString(arr));

    }



}
