package Arrayquestionsonsocrative;

public class Q6 {
    static int a = 11;
    // Remember Static block comes first. It's got the priority.

    public static void main(String[] args) {

        int b = 12;
        System.out.println(b);
    }
    static{
        int c = 13;
        System.out.println(c);
    }

    static{
        a = 14;
        System.out.println(a);
    }



}
