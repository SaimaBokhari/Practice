package pptconstructorquestions;

import javax.crypto.spec.PSource;

public class Pg109 {
    int x = 5;
   Pg109(){       // Constructor name should be the same as class  hence Pg109(){}
       System.out.println("-x" + x);
   }
   Pg109(int x){
       this();
       System.out.println("-x" + x);
   }

    public static void main(String[] args) {
        Pg109 myConstructor1 = new Pg109(4);
        Pg109 myConstructor2 = new Pg109 ();

        System.out.println(myConstructor1);
        System.out.println(myConstructor2);
    }




}
