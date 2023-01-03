package replitquestions.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q11_ForWhile_DuplicateChars {
    /*
    Write a code that returns the duplicate chars in a String array.(interview Question)

Input :

String str=“Java is also easy”

Output: [a, s]

     */
    public static void main(String[] args) {
        String s = "Java is also easy";

        List<String> str = Arrays.asList(s.split(""));

        String repeated = "";
        int i = 0;
        while (i < str.size()) {
            String st = str.get(i);
            if (str.indexOf(st) != str.lastIndexOf(st) && !repeated.contains(st))
                repeated = repeated + st;
            i++;
        }
        repeated=repeated.replaceAll(" ","");
        System.out.println(Arrays.asList(repeated.split("")));







//        Integer counter = 0;
//        for(String w : str){
//            for(String k : str){
//                if(w==k){
//                    counter++;
//                }
//            }
//        }
//        if(counter==str.size()){
//            System.out.println("There is no repeated element");
//        }else{
//            System.out.println("At least one element was repeated");
//        }

//        int idx = 0;
//        for(String w:str){
//            if(!duplicateChar.contains(w)){
//                duplicateChar.add(w);
//            }
//        }
//        int numOfUniqueElements = duplicateChar.size();
//        System.out.println(numOfUniqueElements);
//









    }
}
