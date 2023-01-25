package day29_inheritance.animalTask;

public class Animal {

    public String name, breed, size, color;
    public char gender;
    public int age;

    public static boolean isAnimal;

    static{
        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
PARENT CLASS - doesn't have preference, will contain only common attributes
0. Animal
    attributes (is it needed for the child classes?): name, breed, gender, size, color, age
    methods (is it needed for the child classes?): setInfo(), eat(), sleep(), drink(), toString

CHILD CLASS(ES)
1. Dog
    attributes: [will be inherited via keyword 'extends' from the Parent class]
    methods: [the commons will be inherited from the Parent class], bark()

2. Cat
    attributes: [will be inherited via keyword 'extends' from the Parent class]
    methods: [the commons will be inherited from the Parent class], meow(), scratch()

3. Tiger
    attributes: [will be inherited via keyword 'extends' from the Parent class]
    methods: [the commons will be inherited from the Parent class], hunt()
 */
