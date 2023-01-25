package day27_accessModifiers;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    // this is a nested class
    public class CarEngine{ //without Car class u cannot use the CarEngine class

        public void method(){ //inner class non static
            System.out.println(make);
            System.out.println(wheels);
        }

    }

    public static class StaticInnerClass{

        public void method(){
           // System.out.println(make); //this is non static
            System.out.println(wheels); //it can only take static
        }

    }



}
