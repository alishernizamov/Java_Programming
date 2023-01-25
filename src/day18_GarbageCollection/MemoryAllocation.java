package day18_GarbageCollection;

class Car{

    public String brand; //default value is null
    public String model; //default value is null
    public String color; //default value is null
    public int year; //default value is 0


}

public class MemoryAllocation {
    public static void main(String[] args) {
        int a = 100; //in stack

        Car    car    =    new Car();
        //    stack         heap
    }

    public static void method1() {
        int b = 200; //in stack

    }

    public static void method2() {

        String  c    =   "Hello world";  //it is a string literal and is allocated inside heap in the string pool
        //    stack          heap

        String  d    =  new String("Hello World"); //outside the string pool, inside the heap
        //    stack             heap
    }

}
