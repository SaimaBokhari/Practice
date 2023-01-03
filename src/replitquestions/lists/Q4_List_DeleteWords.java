package replitquestions.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q4_List_DeleteWords {
    /*
    Write a program that deletes the names containing letters 'a' from the names in the list given as input.
         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}

         OUTPUT :
         [Veli,Omer]
     */

    public static void main(String[] args) {
        String[] names = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};
        //System.out.println(Arrays.toString(names));

        List<String> nameList = new ArrayList<String>(Arrays.asList(names));
        System.out.println(nameList);

        for(String w: nameList){
            if(w.contains("A") || w.contains("a")){
                continue;
            }
            System.out.print((Arrays.asList(w + " ")));
        }


        System.out.println();

        LinkedList<String> names1 = new LinkedList<>();
        names1.add("Ali");
        names1.add("Veli");
        names1.add("Ayse");
        names1.add("Fatma");
        names1.add("Omer");

        for(int i=0; i<names1.size(); i++){
            if(names1.get(i).contains("A") || names1.get(i).contains("a") ){
                names1.remove(names1.get(i));
                i--;
            }
        }
        System.out.println(names1);  // [Veli, Omer]

        // using Lambda
        names1.removeIf(t-> t.contains("a"));


//        int idx = 0;
//        for(int i=0; i< names.length; i++){
//            String ch1 = names[i];
//
//            if(ch1.contains("A") || ch1.contains("a") ){
//                continue;
//            }
//            System.out.print(Arrays.asList(ch1));
//        }
//
//        System.out.println();
//
//        // for-each loop
//        for(String w: names){
//            if(w.contains("A") || w.contains("a")){
//                continue;
//            }
//            System.out.print((w + " "));
//        }

//        System.out.println();
//
//
//
//
//        String s = "Java is easy, if you study. Nothing is easy, if you do not study";
//        String str[] = s.split(" ");
//        System.out.println(Arrays.toString(str));
//        String ntr[] = new String[str.length];
//
//        String removed = "Nothing";
//        int idx2 = 0;
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].equals(removed)) {
//                continue;
//            }
//            ntr[idx2] = str[i];
//            idx2++;
//        }
//        System.out.println(Arrays.toString(ntr));



   }







}
