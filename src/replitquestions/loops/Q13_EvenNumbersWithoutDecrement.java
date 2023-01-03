package replitquestions.loops;

public class Q13_EvenNumbersWithoutDecrement {
    public static void main(String[] args) {
        /*
        Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */
        printNos(20, 0);




    }
    public static void printNos(int initial, int last) {
        if (initial >= last) {
            System.out.print(initial + " ");
            printNos(initial - 2, last);
        }
    }






}
