package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender; //cannot be final without initializing them (assigning a value)
    private final int age;
    private final LocalDate dateOfBirth;

    public static final int numberOfHead;

    static{
        numberOfHead = 1;
    }

    //constructor to initialize the variables
    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if ( !(gender=='M' || gender=='F') ){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    //the setter can only be generated for name, the rest of the inst variables are final
    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public final void breath(){ //we will make it final to make sure this implementation will not change for any sub classes
        System.out.println(name+" is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
/*
Variables:
    name, age, gender, DOB,
    numberOfHead
Methods:
    eat(), drink(), sleep()
    breath()

 */
