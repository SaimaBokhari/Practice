package replitquestions.arrays;

public class Q22_Arrays_SumOfDigitsInString {
    public static void main(String[] args) {
        String str = "ade1r4d3 ";
        System.out.println(sumOfDigits(str));

        sumOfDigits(str);
    }


    /*
    Write a method which accepts a String as parameter and prints the sum of the digits,
    present in the given string.

input : ade1r4d3

output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()

     */
    public static int sumOfDigits(String s){
//        int sum = 0;
//
//         s = s.replaceAll("[^0-9]","");
//         for(int i=0; i<s.length(); i++){
//             String p = s.substring(i, i+1);
//             sum += Integer.valueOf(p);
//         }
//         return sum;

        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                sum += Integer.valueOf(s.substring(i,i+1));
            }
        }
        System.out.println("Sum of the digits: " + sum );

        return sum;
    }



}
