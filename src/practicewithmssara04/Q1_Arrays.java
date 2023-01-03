package practicewithmssara04;

import java.util.Arrays;

public class Q1_Arrays {
    public static void main(String[] args) {

        /*
        Type code to check if a specific element in an Array or not.
         */
        // 1st way:

        String str[] = {"Ellie", "Suzan", "Michael", "George", "Tom"};

        String name = "George";
        int counter = 0;

        for(String w: str){
            if(w.equals(name)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println( name + " " + "exists.");
        }else{
            System.out.println(name + " doesn't exist");
        }

        // 2nd way: binary search method

        // If the element exist, binary search method returns the positive
        // index of this element.
        // We have to sort the array first and then use the binary search.
        // If it doesn't exist, it shows negative value and shows the order of the element
        // where it would have existed in alphabetical order.

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int idx = Arrays.binarySearch(str,"Sally");
        System.out.println(idx);











    }
}
