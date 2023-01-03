package pptslidepractice;

public class VariablesQ13 {
    public static void main(String[] args) {

        /* Question on pg. 29 of the PPT Slide pdf.

        byte is between -128 and 127.
        If you type following code, what do you see on the console?

         */
        short num1 = 255;
        byte num2 = (byte)num1;
        System.out.println(num1);
        /* 255 ... This is called explicit narrowing where you create a small container
        for a bigger number. Java doesn't do it automatically. So you tell Java to
        create a smaller data container (byte in this case) and give it a new name "num2"
        and explicitly tell Java to put num1 to (byte) container.
         */


        // 13) What do you see on the console?

        int num3 = 5/2;
        System.out.println(num1);

        float num4 = 5f/2f;
        System.out.println(num2);

        double num5 = 5d/2d;
        System.out.println(num5);



    }
}
