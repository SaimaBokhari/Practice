package practicewithmssara07;

public class Q02_FrequencyOfUsageInString {
    /*
Count the frequency of the letters in a given String as the format below:
Input: String str = "Java is so Good";
Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
 */

    public static void main(String[] args) {
        String str = "Java is so Good";
        String output = "";

        for(int i=0; i<str.length();i++){  // first loop is to take letters one by one

            int counter =0;

            for(int j=0; j<str.length();j++){  // second loop is to check if they're same or not
                if(str.charAt(i)== str.charAt(j)){
                    counter++;
                }
            }
            if(! output.contains(String.valueOf(str.charAt(i)))){
                output = output+str.charAt(i)+counter+" ";
            }
        }
        System.out.println(output);





    }


}
