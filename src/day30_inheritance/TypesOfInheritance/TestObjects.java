package day30_inheritance.TypesOfInheritance;

import java.time.LocalDate;

public class TestObjects {
    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5,16), 'A', "ABC001");


        President president = new President("Daniel", 'M', LocalDate.of(1980,12,1),LocalDate.of(20200,11,12));

        Teacher teacher = new Teacher("Muhtar", 'M', LocalDate.of(1982,10,12),"Teacher", "BBA123",100000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        student.eat("Baklava");
        president.drink("water");
        teacher.drink("coke");



    }

}
