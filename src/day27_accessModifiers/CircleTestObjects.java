package day27_accessModifiers;

import javax.swing.plaf.metal.MetalIconFactory;

public class CircleTestObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
/*
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);
*/
        //call the statics thou the class name, no through the object
        System.out.println(Circle.pi); //Circle: class name
        //System.out.println(Circle.radius); //cannot call instance through class as it is part of object



    }
}
