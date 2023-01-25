package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Han", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        // tiger.hunt();

        Animal animal = new Eagle("John", "American Eacle", 'M', 3, "Small", "Black");
        //animal.fly(); //without changing the reference, you cannot call
        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1 = new Eagle("John", "American Eacle", 'M', 3, "Small", "Black");
        //obj1.eat();
        //obj1.drink90;
        //obj1.sleep();
        obj1.fly();

        System.out.println(obj1.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeocar = null;

        Flyable[] birds = {parrot, eagle};

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};

        //boolean isAnimal = cydeocar instanceof Animal; //compile error because no IS relationship bw 'cydeocar' and 'Animal'
        boolean isAnimal = dog instanceof Animal;

        System.out.println(isAnimal);

        System.out.println("---------------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = "+isTesla);
        System.out.println("isAudi = "+isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);


    }
}
