package replitquestions.arrays;

import java.util.Arrays;

public class Q29_RemoveElementFromArrays {
    /*
    write a Java program to removes a specific element from an array and put the
    remaining elements in a new array and prints the new array

Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]
     */
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6};
        int b[] = new int[a.length-1];
     //   System.out.println(Arrays.toString(b));

        int toBeRemoved =a.length-1;

        for(int i=0, j=0 ; i<a.length;i++){
                if(i==toBeRemoved){
                    continue;
                }
                if(i !=toBeRemoved){
                    b[j++] = a[i];
                }
            }
        System.out.println(Arrays.toString(b));


        // 2nd way:
        int[] arr = { 1, 2, 3, 4, 5,6 };

        // Print the resultant array
        System.out.println("Original Array: "
                + Arrays.toString(arr));

        // Get the specific index
        int index = 5;

        // Print the index
        System.out.println("Index to be removed: " + index);

        // Remove the element
        arr = removeTheElement(arr, index);

        // Print the resultant array
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }


    public static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}
