package day17_customClass;

public class Dog {
    //instance variables:
    public String name; //instance variable - this variable name is needed for all dogs
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        this.name = name; //'this' keyword is used for calling the instance variable
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    } //this method can help us to set all the info of the dog at once

    //Actions: static (cannot have separate copies) or instance - multiple copies (static keyword should not be included)
    public void eat(){ //instance method
        System.out.println(name + " is eating");
    }

    public void drink(){ //instance method
        System.out.println(name + " is drinking water");
    }

    //to creat a toString method

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
