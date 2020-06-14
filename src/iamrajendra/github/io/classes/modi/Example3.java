package iamrajendra.github.io.classes.modi;

import java.util.Arrays;

public class Example3 {
    static Arnav arnav;
    static Modi modi;

    public static void main(String[] args) {
//        Arnav.x =9;

        arnav  =  new Arnav();
        arnav.x =10;
        modi = new Modi();
        arnav.helloWorld();
        System.out.println("Value of X in Side Arnav "+arnav.x );
        System.out.println("Value of X in Side Modi "+modi.x );

           }
}

