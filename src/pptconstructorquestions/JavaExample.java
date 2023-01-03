package pptconstructorquestions;

// Pg 116 and 117
public class JavaExample {
    static  int i = 100;
    static String s = "Beginner's book";

    // Static method:

    static void display(){
        System.out.println("i:" + i);
        System.out.println("i:" + s);
    }

    // non-static method:
    void funcn(){
        display();          // static method called in non-static method
    }

    // static method:
    public static void main(String[] args) {

        JavaExample obj = new JavaExample();
        // you need to have an object to call this non-static method.
        obj.funcn();

        // static method called in another static method

        display();

    }






}
