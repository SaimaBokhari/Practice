package practicewithmssara06;

public class Q03_CalculateVolumeOfCube {
    // Create a method to calculate volume of a cube, square
    // prism and rectangular prism.

    public double volumeOfCube(double a){ // a*a*a ==> gives you the required outcome. Only one length is enough to calculate.
        return a*a*a;
    }

    public static double volumeOfSquarePrism(double a, double b){  // a*a*b
        return a*a*b;
    }

    public static double volumeOfRectangularPrism(double a, double b, double c){
        return a*b*c;
    }


}
