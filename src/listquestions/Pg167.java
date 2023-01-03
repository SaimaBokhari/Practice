package listquestions;

import java.util.ArrayList;
import java.util.List;

public class Pg167 {
    public static void main(String[] args) {

        // Q.2
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
     //   list.add(7);
        for(String s:list){
            System.out.println(list);
        }
    }
}

//Ans: Compile error on line 12
