package Varargsfrompptslide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pg166 {
    public static void main(String[] args) {
        //  1) What's the result of the following code?

        String a = "";
        a +=2;
        a +='c';
        a += false;
        if (a=="2cfalse"){
            System.out.println("==");
        }
        if(a.equals("2cfalse")){
            System.out.println("equals");
        }

        //  2) What's the result of the following statements?

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
 //       list.add(7);    // compile time error .. coz 7 is int
        for(String s : list ){
            System.out.println(list);
        }

        //  3) What's the result of the following statements?

        List<Integer>values = new ArrayList<>();
        values.add(4);
        values.add(6);
        values.set(1, 6);
        values.remove(0);

        for(Integer v:values ){
            System.out.println(values);
        }

        //  4) What's the result of the following?

        int [] random = {6, -4, 12, 0, -10 };
        int x=12;
        int y= Arrays.binarySearch(random, x);
        System.out.println(y);



    }
}
