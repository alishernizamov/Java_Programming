package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;

    public Person(String name, int age, char gender, LocalDate DOB) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDOB(DOB);
    }

    public String getName() {

        if (name == null){
            return "Unknown";
        }

        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank() || name == null){
            System.err.println("Name cannot empty, blank or null"+ name);
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 120 ){
            System.err.println("Invalid age entry "+age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if ( ! (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') ){
            System.err.println("Wrong gender entry " +gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {

        if ( DOB == LocalDate.now().plusDays(1) ){
            System.err.println("Wrong D.O.B. entry "+DOB);
        }

        this.DOB = DOB;
    }


    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", DOB=" + getDOB() +
                '}';
    }
}

/*
Variables:
    name, age, gender, dateOfBirth
        name:
            Write: can not be null/empty/blank
            Read: if name is not, return "Unknown" instead
        age:
            Write: age can not be less than zero or greater than 120
        gender:
            Write: gender can only be 'M' or 'F'
        dateOfBirth:
            Write:  can not be after today's date
    Add a constructor that can set all the fields
    Add toString()
 */


