package day31_inheritance.shape_MethodOverriding;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{

    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double perimeter(){
        return side1 + side2 + side3;
    }

    public double area(){
        double s = perimeter()/2;
        return Math.sqrt(s* (s-side1) * (s-side2) * (s-side3) );
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("            *");
        System.out.println("          *   *");
        System.out.println("        *       *");
        System.out.println("      *           *");
        System.out.println("    *               *");
        System.out.println("  *                   *");
        System.out.println("*  *  *  *  *  *  *  *  *");
    }
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name= '" + getName() + '\'' +
                ", sides= " + "s1: "+getSide1()+", "+"s2: "+getSide2()+", "+"s3: "+getSide3()+
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }


}
