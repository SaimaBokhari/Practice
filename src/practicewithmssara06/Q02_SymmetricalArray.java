package practicewithmssara06;

public class Q02_SymmetricalArray {

    // Type a method to check if an int array is symetrical or not.
    // Palindrome


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 2, 1};
        System.out.println("Is Array symmetrical? " + symmetrical(arr));

    }

    public static boolean symmetrical(int[] arr) {
        boolean result = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }





}
