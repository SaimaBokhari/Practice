package pptslidepractice;

public class JoiningStringsConcatenation {

    public static void main(String[] args) {

        /* Example:
        String str1 = “Learn” + “Java”;
         str1 = ?
         LearnJava
         */

// Example: String str4 = “2” + “5” ;
//           str4 = ?
        int l = 4, m = 5;
        String str1 = "2" + "5";
        System.out.println(str1);

// String str5 = 2 + 3 + “4” ;
//        str5 = ?
        int a=2, b=3, c=4;
        String str2 = 2 + 3 + "4";
        System.out.println(str2);

 // Example: String str6 = “2” + (5 + 1) ;
        //str3 = ?
        int d=2, e=5, f=1;
        String  str3 = "2" + (5+1);
        System.out.println(str3);

// Example: String str2 = “Learn” + “ ” + “Java”;
//str2 = ?

        String g = "Learn", h="Java";
        String str4 = "Learn" + "Java";
        System.out.println(str4);
        String str5 = "Learn" + " " +"Java";
        System.out.println(str5);



    }
}
