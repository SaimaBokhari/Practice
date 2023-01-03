package stringbuilder;

public class Square {

    // Q.7
    public static long square (int x){
        long y= x * (long) x;
        x = -1;
        return y;
    }

    public static void main(String[] args) {
        int value = 9;
        long result = square(value);
        System.out.println(value);

        //Ans: B
    }

}
