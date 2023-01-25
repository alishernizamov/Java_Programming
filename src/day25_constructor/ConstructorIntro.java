package day25_constructor;

public class ConstructorIntro {

    public ConstructorIntro(){ //no argument constructor
        System.out.println("Object is created by using no argument constructor");
    }

    public ConstructorIntro(int a){ //parameterized constructor
        System.out.println("Object is created by using int argument constructor");
    }

    public void add(){

    }

    public static void main(String[] args) {

        ConstructorIntro ob1 = new ConstructorIntro(10);

        ConstructorIntro ob2 = new ConstructorIntro();

       // ConstructorIntro obj3 = new ConstructorIntro("Java");


    }
}
