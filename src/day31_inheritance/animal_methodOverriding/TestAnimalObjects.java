package day31_inheritance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Jinjack", "Bengal", 'm', 1, "Large", "Brown");

        Dog dog = new Dog("Max", "Husky", 'm', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African", 'm', 6, "Large", "Yellow", true);

        Eagle eagle = new Eagle("Bella", "American Eagle", 'f', 4, "Medium", "Black & White");

        System.out.println(cat);

        System.out.println(dog);

        System.out.println(lion);

        System.out.println(eagle);


        System.out.println("-------------------------eat()--Method--------------------------------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        System.out.println("------------------------sleep()--Method-----------------------------");

        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();






    }

}
