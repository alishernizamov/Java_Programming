package day28_encapsulation.encapsulation;

public class Employee {

    private String name;

    private int age;

    private String jobTitle;

    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name); //whatever the condition we set in the getter/setter they will be checked before initializing the variables
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //GETTER AGE
    public int getAge() {
        return age;
    }

    //SETTER AGE
    public void setAge(int age) {

        if (age < 16){
            System.err.println("Invalid age " + age);
            System.exit(1);
        }

        this.age = age;
    }

    //GETTER JOB TITLE
    public String getJobTitle() {
        return jobTitle;
    }

    //SETTER JOB TITLE
    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title of employee cannot be empty or blank");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    //GETTER
    public String getName() {

        if (name == null){
            return "Unknown";
        }

        return name;
    }

    //SETTER
    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { //WRITE

        if (salary < 0){ //CONDITION HAS TO BE CHECKED
            System.err.println("Salary cannot be negative "+ salary);
            System.exit(1);
        }



        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
