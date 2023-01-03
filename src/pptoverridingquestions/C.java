package pptoverridingquestions;
// Q6 Pg259
public class C {
//        public void create(){
//            System.out.println("c");
//    }

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
        System.out.println(obj1.i);

        A obj2 = new B();
        obj2.display();
        System.out.println(obj2.i);


        A obj3 = new A();
        obj3.display();
        System.out.println(obj3.i);

//        B obj4 = new A();
//        obj4.display();
//        System.out.println(obj4.i);


    }




}
