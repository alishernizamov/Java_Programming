package day38_exceptions;

import java.util.InputMismatchException;

public class Person {


    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if ( !(gender == 'M' || gender == 'F') ){ //if gender is invalid
            throw new RuntimeException("Invalid gender: "+gender); //throws the runtime exception during runtime and crashes the program
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age==0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 150){ //if the given age is not valid
            throw new RuntimeException("Invalid age: "+age); // throws the runtime exception during run time and crash program
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
