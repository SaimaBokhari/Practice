package pptslidepractice;

public class VariablesQ14 {
    public static void main(String[] args) {

        // 14) What do you see on the console?

        int num1 = 5/3;
        System.out.println(num1);

        float num2 = 5f/3f;
        System.out.println(num2);

        double num3 = 5d/3d;
        System.out.println(num3);

        /* double is more sensitive data type; can read upto 16 digits after decimal.
         */

        int num4 = Integer.MIN_VALUE; // can't use num1 cos it's already used in the above question.
        System.out.println(num4);
        int num5 = Integer.MAX_VALUE;
        System.out.println(num5);

        int num6 = Byte.MIN_VALUE;
        System.out.println(num6);
        int num7 = Byte.MAX_VALUE;
        System.out.println(num7);

    }
}
