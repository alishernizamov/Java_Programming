package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;
    public boolean isMarried, isEmployed;

    public Person(String name, int age, char gender, LocalDate DOB, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat(){
        System.out.println(name+" is eating lunch");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void drink(){
        System.out.println(name+" drinking tea");
    }



}

/*

5 person objects
name, age, gender, DOB, isMarried, isEmployed

toSting()
DOB MM/dd/y

eat(String food), sleeping(), drink(String drink)

 */
