package listquestions;

public class Pg166 {
    public static void main(String[] args) {

        //Q.1
        String a = "";
        a += 2;
        a += 'C';
        a += false;
        if(a=="2cfalse"){
            System.out.println("==");
            if(a.equals("2cfalse")){
                System.out.println("equals");
            }
        }
    }
}
// Nothing is printed on the console.