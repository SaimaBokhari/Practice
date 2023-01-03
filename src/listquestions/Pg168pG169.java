package listquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pg168pG169 {
    public static void main(String[] args) {

        // Q.3
        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (Integer v:values){
            System.out.println(v);
        }
        //Ans: 6

        // Q.4

        int[] random = {6, -4, 12, 0, -10};

//        Arrays.sort(random);
//        System.out.println(Arrays.toString(random));
        int x = 12;
        int y = Arrays.binarySearch(random,x);
        System.out.println(y);


    }

}
//Ans: 2
