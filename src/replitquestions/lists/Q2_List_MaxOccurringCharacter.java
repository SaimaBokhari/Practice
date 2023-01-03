package replitquestions.lists;

public class Q2_List_MaxOccurringCharacter {
    /*
    Write a Java program to get a String from user as input and find the
    maximum occurring character in that string. (Ignore case sensitivity)

input :

Learning java is easy

output:

maximum occurring character is : a
     */
    public static void main(String[] args) {
        String str = "Learning java is easy";

        System.out.println("maximum occurring character is : " + maxOccurringCharacter(str));
    }

    static final int ASCII_SIZE = 256;

    public static char maxOccurringCharacter(String str){
        int count [] = new int[ASCII_SIZE];

        int length = str.length();
        for(int i=0; i<length; i++){
            count[str.charAt(i)]++;

        }

        int max = -1;
        char result = ' ';

        for(int i=0; i<length; i++ ){
            if(max<count[str.charAt(i)]){
                 max = count[str.charAt(i)];
                 result = str.charAt(i);
            }
        }
        return result;
    }


}
