package Arrayquestionsonsocrative;

public class Q5 {

        static int a = 11;

        public static void main(String[] args) {
            int b = 12;
            System.out.println(b);
        }                   // Though static block is after the main method, it's still got priority.

        static {           // This is a static block. When there's static block, Java starts with static block value.
            a = 13;        // It has got priority.
            System.out.println(a);
        }

        // Q.6





    }

