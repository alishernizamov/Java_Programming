package day27_accessModifiers;

public class NestedClassTestObjects {
    public static void main(String[] args) {

        Car obj1 = new Car(); //Car object

        //w/o the Car object you cannot have the CarEngine (inner class) object
        Car.CarEngine obj2 = obj1.new CarEngine(); //CarEngine object

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); //inner class 'StaticInnerClass()' can be called through the outer class 'Car'




    }
}
