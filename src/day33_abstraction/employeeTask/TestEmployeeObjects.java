package day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        //Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 85000);
         //We cannot create objects from an abstract class, Object must be created from concrete classes

        Teacher teacher = new Teacher("Elena", 35, 'F', "AB01", "Math Teacher", 50000);

        Developer developer = new Developer("Lucy", 35,'F',"AB303","Developer", 105000, "Java");

        Driver driver = new Driver("Jack", 40, 'M', "BB04", "Driver", 60000);

        Tester tester = new Tester("Shahina", 30, 'F', "BY50", "Tester", 105000);


        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("---------------------------------------");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();




    }
}
