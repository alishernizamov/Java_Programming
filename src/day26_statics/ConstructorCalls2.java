package day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2() { //t will print default constructor
        System.out.println("Default");
    }

    public ConstructorCalls2(int a) { //Default, int argument
        this(); //calling the default constructor
        System.out.println("int arg");
    }

    public ConstructorCalls2(String a) { //Default, int arg, string arg
        this(10); //calling the constructor with int arg
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("-------------------------------------");

        ConstructorCalls2 ob2 = new ConstructorCalls2(10);

        System.out.println("-------------------------------------");

        ConstructorCalls2 ob3 = new ConstructorCalls2("Java");

    }


}
