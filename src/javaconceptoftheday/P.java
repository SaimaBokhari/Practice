package javaconceptoftheday;
// Q.17 changed the names M,N to P,Q
public class P {
        int i;

        public P(int i) {
            this.i = i--;
        }
    }

    class Q extends P
    {
        public Q(int i)
        {
            super(++i);

            System.out.println(i);
        }
    }

