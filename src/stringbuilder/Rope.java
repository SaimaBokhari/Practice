package stringbuilder;

public class Rope {

    // Q.6
    public static void swing(){
        System.out.println("Swing");
    }

    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
  //      climb();
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();
    }

    // Ans: B and E

}
