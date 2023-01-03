package replitquestions.lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1_List_Swap8thElementWith3rd {
    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.


INPUT :
String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

     */
    public static void main(String[] args) {

//        String names [] = new String[10];
//        names[0] = "Umit";
//        names[1] = "Emin";
//        names[2] = "Kemal";
//        names[3] = "Kerem";
//        names[4] = "Taylan";
//        names[5] = "Orhan";
//        names[6] = "Sinan";
//        names[7] = "Furkan";
//        names[8] = "Ahmet";
//        names[9] = "Ali";
//        System.out.println(Arrays.toString(names));

        String [] a = {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        swap(a, 8, 3);
        System.out.println("a:"+Arrays.toString(a));
        List<String> l = new ArrayList<String>(Arrays.asList(a));
        swap(l, 8, 3);
        System.out.println(l);


    }

    public static final <String> void swap (String[] a, int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static final <String> void swap (List<String> l, int i, int j) {
        Collections.<String>swap(l, i, j);
    }


}
