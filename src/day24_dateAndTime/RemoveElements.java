package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        //DO NOT USE REMOVE() IN ANY LOOP
        System.out.println("--------------DO NOT REMOVE() METHOD WITH ANY LOOP-------------------");
        for (int i = 0; i < list.size(); i++) { //access each element to determine which one is less than 4
            if (list.get(i) < 4){
                list.remove(i);
            }
        //DO NOT USE REMOVE() IN ANY LOOP
        }
        System.out.println(list);

        System.out.println("--------------HERE IS THE RIGHT SOLUTION---removeIf()---method-------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list2.removeIf( p -> p < 4 ); //p: predicate variable. It iterates and assigns every element to 'p' and
                                      //removes any number that are less than 4 as per the condition

        System.out.println(list2);

        System.out.println("-------------removeIf()-------------------------------------");

        //remove the strings that start 'J'
        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList( "Java", "Python", "C#", "Java", "Ruby", "C" ) );

        names.removeIf( each -> each.startsWith("J"));

        System.out.println(names);

        System.out.println("-------------removeIf()-------------------------------------");

        //TASK: remove employees whose salary is >100,000
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        employees.removeIf( p -> p.salary > 100000 ); //p: represents each employee object

        for (Employee each : employees) {
            System.out.println(each.name + " : "+ each.salary);
        }

    }

}

/*Write a program that can remove the elements that are less than 4, from an ArrayList of integer
            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};
            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
                
 */
