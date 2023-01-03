package pptslidepractice;

public class ConcatenationQ19 {
    public static void main(String[] args) {

        /*
        19) int numA = 2;
        int numB = 3;
        String str1 = “Study”
        String str2 = “Hard”
        Type a program to see the following outputs on the console
        by using “concatenation” operation.

        A) Study Hard B) 5 Study C) Hard23 D) Hard1
         */

        int numA = 2 , numB = 3;

        String str1 = "Study";
        String str2 = "Hard";


        //A)
        String str3 = "Study" + " " + "Hard";
        System.out.println(str3);

        //B)
        String str4 = 2+3+" "+"Study";
        System.out.println(str4);

        //C)
        String str5 = "Hard" + "2"+"3";
        System.out.println(str5);

        //D)

        String str6 = "Hard" + (3-2);
        System.out.println(str6);

        /*
        19)  int numA = 2;                int numB = 3;
        String str1 = “Study”
        String str2 = “Hard”
          Type a program to see “61Study-1” as output on the console
        by using “concatenation” operation.

         */

        // the values are the same used in the above question so no need to write again.

        String str7 = (2*3) + " " + (3-2)+ "Study"+ (-3+2);
        System.out.println(str7);  // 7Study-1





    }
}
