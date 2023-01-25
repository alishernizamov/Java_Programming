package day03_variables;

public class EmployeeInfo {

    public static void main(String[] args) {

       String name = "Daniel";
       int age = 35;
       char gender = 'M';
       String employeeName = "Daniel";  //combining same data type into one variable declaration
       String companyName = "Google Inc",
               employeeId = "A19",
               jobTitle = "Java Developer";
       int salary = 110000;
       boolean isFullTime = true;


        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(employeeName);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("--------------------------------------------------");

        System.out.println("employeeName = " + employeeName);  // shortcut: soutv to call the variable along with the variable data
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);


    }

}

/*
1. Create a class named EmployeeInfo.java
2. Declare the following variables with appropriate data types:
    1. name
    2. age
    3. gender
    4. companyName - can be combined under one variable as this is String
    5. employeeId - can be combined under one variable as this is String
    6. jobTitle - can be combined under one variable as this is String
    7. salary
    8. isFullTime
 */