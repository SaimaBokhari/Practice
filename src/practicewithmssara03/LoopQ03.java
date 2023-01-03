package practicewithmssara03;

public class LoopQ03 {
    public static void main(String[] args) {

        // palindrome= the same in normal reading or reverse reading.


        //Type code to check if a given integer is palindrome or not.
        // 121 <==> 121,      123321 <==> 1233321 ,       nalan <==> nalan

        // 1st way: while loop method

        String str = "Nalan";
        String reversed = "";

        int idx = str.length()-1;   //starting value

        while(idx>-1){              // condition
           reversed = reversed+str.charAt(idx);
           idx--;                  // decrement
        }
        if(str.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");  // remember Java is always case-sensitive.
        }

        System.out.println("====================================================="); // to separate the answers on the console.

        // 2nd way: for loop

        for(int i=str.length()-1; i>-1; i--){
            String ch = str.substring(i, i + 1);
            reversed = reversed + ch;
        }
        if(str.equals(reversed)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }

        // another example

        String strI2= "ey edip adanada pide ye";
        String reversed2= "";

        int idx2=strI2.length()-1;
        while(idx2>-1){
            reversed2=reversed2+ strI2.charAt(idx2);
            idx2 --;
        }
        if (strI2.equals(reversed2)){

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        /* Process:
        1) Take input from the user or initialise it manually (num).
        2) Store the input in a new variable (element).
        3) Until num is not equal to zero, find the reminder of the num and store it in a variable (reverse).
        4) Divide the num by ten and repeat step 3 using a while loop.
        5) Check if the element is equal to reverse.
        6) If it is equal,
                      Print it is palindrome
        7)  Else print it is not palindrome.
         */












    }
}
