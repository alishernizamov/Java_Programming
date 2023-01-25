package day18_GarbageCollection;

import day17_customClass.Dog;

import java.sql.SQLOutput;

public class GarbageCollection {
    public static void main(String[] args) {

        //GarbageCollection.finalize();

        String s1 = "Java";
        s1 = null; //"Java" will be eligible for garbage collection


        System.out.println(s1);
        //System.out.println(s1.toUpperCase());

        //when something is null you cannot access it

        String a = ""; //empty object
        String b = null; //nonexistent

        System.out.println("-----------------------------------------------");

        String str1 = "Python";
            str1 = "CYDEO";


        System.out.println(str1);

        System.out.println("-------------------------------------------");


        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow Chow", 'm', 3, "medium", "black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "bulldog", 'M', 5, "small", "white");

        dog1 = dog2; //original dog1 (Loki) is now eligible for garbage collection

        System.out.println(dog1);
        System.out.println(dog2);

        //new Dog().finalize(); //process of garbage collecting

    }
}
