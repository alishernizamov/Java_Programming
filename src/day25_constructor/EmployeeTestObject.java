package day25_constructor;

import java.time.LocalDate;

public class EmployeeTestObject {
    public static void main(String[] args) {

        Employee e1 = new Employee("Khashavar", 32, 'M', "Java Developer", 95000,
                LocalDate.of(2022,12,15));

        Employee e2 = new Employee("Mohamed", 31, 'M', "Project Manager", 100000,
                LocalDate.of(2022,11,15));

        System.out.println(e1);
        System.out.println(e2);


    }
}
