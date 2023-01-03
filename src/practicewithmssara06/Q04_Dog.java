package practicewithmssara06;

public class Q04_Dog extends Q04_Animal {

    public void bark(){
        System.out.println("Dogs bark");
    }

    @Override
    public void drink() {
        System.out.println("Dogs don't drink milk.");
    }

    @Override
    public void move() {
        System.out.println("Dogs love to run.");
    }


}
