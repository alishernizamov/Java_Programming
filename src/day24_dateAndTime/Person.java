package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear(); //no need to use this. keyword as there is no variable called age
    }

    @Override
    public String toString() {
        return "Person {" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                ", dateOfBirth= " + dateOfBirth +
                '}';
    }
}
