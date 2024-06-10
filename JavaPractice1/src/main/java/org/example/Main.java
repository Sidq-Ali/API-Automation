package org.example;

public class Main {
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle();
      /* r1.setwidth(12);
       r1.setlenght(10);*/
        Rectangle r2 = new Rectangle(10,12);
        System.out.println(r1.getwidht());
        sout(r1.getlenght());

       r1.calculateArea();
       r2.calculateArea();
       r2.print();
      r1.print();
    }
}