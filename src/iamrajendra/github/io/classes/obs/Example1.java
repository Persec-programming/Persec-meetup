package iamrajendra.github.io.classes.obs;

public class Example1 {
    private static A a;
    /*
    * private is accessible for members of that same class only
    * protected can not access out side the package
    * public can access across the eco-system of java
    *
    * doubt is what is the difference between default and protected
    */

    public static void main(String[] args) {
        a = new A();
        System.out.println("Value of X " + a.x);
        System.out.println( a.helloWord());
    }


}
