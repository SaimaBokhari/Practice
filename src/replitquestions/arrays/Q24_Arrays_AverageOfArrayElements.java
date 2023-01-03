package replitquestions.arrays;

public class Q24_Arrays_AverageOfArrayElements {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
         */

        int[] a = {1,2,3,4,5,6,7};



        int sum = 0;
        for(int w: a){
            sum += w;
        }
        System.out.println(sum/a.length);









    }
}
