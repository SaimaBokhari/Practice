package practicewithmssara05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindingSumLeastAndGreatest {
    public static void main(String[] args) {

        /*
        Find the sum of the least and the greatest price given in a String List.
Example: List<String> myList= new List<String>{"$12.99", "$8.25", "$23.60", "$54.45"}; ==> 62.70
         */

        // 1st way:
        List<String> list = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(list);

        List<Double> myList = new ArrayList<>();

        for(String w: list) {
            double price = Double.valueOf(w.replace("$", ""));
            myList.add(price);
        }

        Collections.sort(myList);
        System.out.println(myList);
        System.out.println(myList.get(0)+ myList.get(myList.size()-1));



        // 2nd way:

        List<String> b = new ArrayList<>();
        b.add("$12.99");
        b.add("$8.25");
        b.add("$23.60");
        b.add("$54.45");
        List<Double> decimalList = new ArrayList<>();

        for (String w : b) {
            Double prc = Double.valueOf(w.replace("$", ""));
            decimalList.add(prc);
        }
        Collections.sort(decimalList);
        Double summy=decimalList.get(0)+decimalList.get(decimalList.size()-1);
        System.out.println(summy);








    }
}
