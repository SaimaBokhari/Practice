package practicewithmssara06;

public class Q04_Cat extends Q04_Animal {

    public void meow(){
        System.out.println("Cats meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat meat.");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink milk");
    }



}
