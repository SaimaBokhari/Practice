package replitquestions.arrays;

import java.util.*;

public class Q28_Arrays_CommonElements {
    public static void main(String[] args) {
        /*
        Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}


Output : [sofia,brad,emily]
         */

        String arr [] = {"John","Brad","Ange","Sofia","Emily"};
        String brr[] = {"sofia","brad","grace","emily","hazel"};

//        System.out.println(Arrays.toString(arr).toLowerCase());
//        System.out.println(Arrays.toString(brr));

        HashSet<String> set = new HashSet<String>();

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<brr.length; j++){
                if(arr[i].toLowerCase().equals(brr[j])){
                   set.add (arr[i].toLowerCase());
                }
            }
        }
        System.out.println(set);









/*
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
on the outside and the longer string on the inside. The strings will not be the same length, but
they may be empty (length 0).
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */

//        String s = "hi";
//        String p = "Hello";
//
//        if(s.length()<p.length()){
//            System.out.println(s+p+s);
//        }else{
//            System.out.println(p+s+p);
//        }
//
//
    }

//    public static void printStringsByLength(List<String> list){
//        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printWithSpace);
//    }
//
}
