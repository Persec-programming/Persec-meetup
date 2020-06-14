package iamrajendra.github.io.classes.encap;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
   static List<Blood> bloodList;
    public static void main(String[] args) {

        bloodList  = new ArrayList<>();
Blood  b1  = new Blood();
   b1.setId(212);
   b1.setFat(5);
   b1.setProtien(10);
   b1.setIron(30);
   bloodList.add(b1);
        Blood  b2  = new Blood();
        b2.setId(200);
        b2.setFat(1);
        b2.setProtien(13);
        b2.setIron(30);
        bloodList.add(b2);

        for (int i = 0; i < bloodList.size(); i++) {
            System.out.println("Tell me Id"+bloodList.get(i).getId());
            System.out.println("How much Fat"+bloodList.get(i).getFat());
            System.out.println("How much Protien"+bloodList.get(i).getProtien());
            System.out.println("How much Iron"+bloodList.get(i).getIron());
        }

    }
}
