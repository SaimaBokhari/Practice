package practicewithmssara06;

public class Q01_SumOfFirstIntegersWithNumbers {

    /*
       Create a method that adds given integers except the first one and
       multiplies the sum by the first integer.
         a*(b+c+d+f)
    */
    public static void main(String[] args) {

        myMethod(7,  4,6,-7,100); // 721
        myMethod(0, 111, 43, 56);  // 0
        myMethod(-1, 5,7,89);  // -101

        myMethod(3.23, 12, 45, 78);  // 436.05

        myMethod(2.45, 23.5,34.9,12.6);  //
    }

    public static void myMethod(int a, int...numbers){
        int sum = 0;
        for(int w:numbers){
            sum+= w;  // different way of typing sum = sum+w; ... sum will be increased by "w".
        }
        System.out.println(a*sum);
    }

    public static void myMethod(double a, int... numbers){
        int sum = 0;
        for(int w:numbers){
            sum+= w;  // different way of typing sum = sum+w; ... sum will be increased by "w".
        }
        System.out.println(a*sum);
    }

    public static void myMethod(double a, double... numbers){
        double sum = 0;
        for(double w:numbers){
            sum+= w;  // different way of typing sum = sum+w; ... sum will be increased by "w".
        }
        System.out.println(a*sum);
    }

    // We are changing main method (myMethod) by changing the method signatures(parameters)
    // by adding second and third static method , we are doing overloading in this class.




}
