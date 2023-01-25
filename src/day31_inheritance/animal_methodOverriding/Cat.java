package day31_inheritance.animal_methodOverriding;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    //overriding the 'eat' method that is in the Animal (parent) class

    public void eat() {
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    public void sleep() {
        System.out.println(getName() + " sleeps 12 hours daily");
    }

    public void scratch() {
        System.out.println("Cat "+getName()+" is scratching");
    }


}
