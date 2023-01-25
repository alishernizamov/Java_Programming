package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls() {
       // this(9);
        System.out.println("Default constructor"); //i.e. constructor with no argument

    }

    public ConstructorCalls(int a) { //you cannot call the constructor in another constructor by their names
        this();
        System.out.println("Constructor with int argument");
        //this(); // constructor call has to be at the first step
    }

    public ConstructorCalls(double b) {
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this(2.5); //it called the Constructor with the double parameter
        //this();
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();

        System.out.println("-----------------------------");

        method2();


    }

    public static void method1() {
        //ConstructorCalls();
        //this();
        System.out.println("Method1");
    }

    public static void method2() {
        method1();
        System.out.println("Method2");

    }


}
