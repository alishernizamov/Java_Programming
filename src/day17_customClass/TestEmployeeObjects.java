package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Damileka", 25, 'f', "Nurse", 100000, "HOT768");

        Employee employee2 = new Employee();
        employee2.setInfo("Artyomka", 28, 'm', "SDET", 95000, "ABC123");

        Employee employee3 = new Employee();
        employee3.setInfo("Kazim", 32, 'm', "SDET", 98000, "BRO909");

        employee2.age = 56;
        employee3.name = "Lucy";
        employee3.gender = 'f';

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();








    }





}
