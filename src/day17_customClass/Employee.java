package day17_customClass;

public class Employee { //instance method. When you put "static" it will be set to one criterion only
                        //for ex. if you put Static for salary (public static double salary;) all salaries will be the same
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;

    //instance method
    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    } //sets all attribute of the employee objects at once

    //instance method
    public String toString() { //to avoid getting hashcode when we print employee objects
        return "Employee_CustomClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work(){ //it displays the name of the employee with message " is working"
        System.out.println(name + " is working");
    }



}
