package iamrajendra.github.io.classes.cons;

import java.util.Arrays;

public class Example2 {
    private  static B b;
    private static  B1 b1;
    public static void main(String[] args) {
        b =  new B(4);
        System.out.println("Value of X inside the B "+b.x);
        b1 =  new B1();
        System.out.println("Value of X inside the B1 "+b1.x);

    }

}
