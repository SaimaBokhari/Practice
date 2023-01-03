package practicewithmssara06;

public class Q04_Bird extends Q04_Animal {

    public void tweet(){
        System.out.println("Birds tweet");
    }

    @Override
    public void move() {
        System.out.println("Birds fly.");
    }

    @Override
    public void eat() {
        System.out.println("Birds eat insects.");
    }

    @Override
    public void weight() {
        System.out.println("Birds usually are light weight.");
    }
}
