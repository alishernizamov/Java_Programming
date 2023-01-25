package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hireDate;

    //this is a CONSTRUCTOR - allows us to set al instances variables of the object as soon as the object is created
    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hireDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    //TOSTRING- allows s to print objects when it's passed in the print statement-
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }
}

/*
name
age
gender
job title
salary
hire date
 */
