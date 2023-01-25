package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        //in order to access every single element, we use for each loop

        //print names and job titles
        System.out.println("------------------names and job titles----------------------------");
        for (Employee each : employees) {
            System.out.println(each.name + " : " + each.jobTitle);
        }
        System.out.println("---------------display the names of \"Java Developers\"-------------------");
        //access each element and check the job titles
        for (Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")) { //if job title is Java Developer
                System.out.println(each.name); //prints the names of emmployees who are java devs
            }
        }

        System.out.println("---------------display-the-maximum and minimum salary-------------------");

        double max = employees.get(0).salary; //get() to get the element value
        double min = employees.get(0).salary;

        //next is to get every single salary

        for (Employee each : employees) {
            if (each.salary > max ){
                max = each. salary;
            }

            if (each.salary < min ){
                min = each.salary;
            }

        }

        System.out.println("max salary= "+max);
        System.out.println("min salary= " + min);


        System.out.println("---------------femaleEmployees and maleEmployees------------------");

        ArrayList <Employee> femaleEmployees = new ArrayList<>();
        ArrayList <Employee> maleEmployees = new ArrayList<>();

        for (Employee employee : employees) {
        //create a condition that checks the list for male and female employees
            if (employee.gender == 'M'){
                maleEmployees.add(employee); //if male is detected, it adds it to maleEmployee list
            }else{
                femaleEmployees.add(employee); //if female is detected, it adds it to femaleEmployee list
            }

        }

        //insite print statement: size() retrieves the number of such employees
        System.out.println("Total number of female employees: "+femaleEmployees.size());
        System.out.println("Total number of male employees: "+maleEmployees.size());



    }
}

/*
1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));
	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");
	        Note: Employee class is imported from day17 package
	        1.1 Write a program that can display the name and job title of each employee
	        1.2 Write a program that can display the names of "Java Developers"
	        1.3 Write a program that can display the maximum and minimum salary
	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male employees to the femaleEmployees and maleEmployees arraylists
 */
