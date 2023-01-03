package pptoverridingquestions;

public class Test extends Derived {
    // Q.1 pg.254
    public int getDetails(String temp) {
        System.out.println("Derived class " + temp);
        return 0;
    }


    // Q.2 pg.255
//    protected void getDetails(){
//        System.out.println("Test class");
//    }

    public static void main(String[] args) {
        // Q.1 pg.254
//        Test obj = new Test();
//        obj.getDetails("GFG");
//    }

    /*
    a) Derived class GFG
    b)Test class GFG
    c) Compilation error
    d) Runtime error

    Ans: c
     */

        // Q.2 pg.255

        Derived obj = new Test();
        obj.getClass();
    }

    /*
    a) Test class
    b) Compilation error
    c) Derived clas
    d) Compilation error due to access modifier

    Ans: d

    Q.3, 4 COMPILATION ERROR
     */

}
