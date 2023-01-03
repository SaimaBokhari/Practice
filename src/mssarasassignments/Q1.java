package mssarasassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        // Create a method that joins the given Strings
        // input => "Please", "join", "the", "given", "words"
        // output => "Please join the given words"


        List<String> s = Arrays.asList("Please", "join", "the", "given", "words");

        int idx = 0;
        for(String w:s){
            String st = s.get(idx);
           idx++;
            System.out.print(st + " "); // Please join the given words
        }



    }
}
