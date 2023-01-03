package stringbuilder;

public class Pg183Pg184 {
    public static void main(String[] args) {
        // Q.3

        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));


        // Q.4

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
        total += letters.substring(6,5).length();
        System.out.println(total);


        // Ans: An exception is thrown


    }
}
