package day25_constructor;

import java.time.LocalDate;

public class PersonTestObject {
    public static void main(String[] args) {

        Person p1 = new Person("Michael Jackson", 32, 'm',
                LocalDate.of(1969, 03, 15),true, true);
        p1.age = 40;

        p1.eat();
        p1.drink();
        Person p2 = new Person("Alisher Nizamov", 46, 'm',
                LocalDate.of(1976, 05, 21),true, true);

        Person p3 = new Person("Fatima Ismatova", 40, 'f',
                LocalDate.of(1980, 07, 03),true, true);

        Person p4 = new Person("Russel Crow", 50, 'm',
                LocalDate.of(1972, 03, 15),true, true);

        Person p5 = new Person("Sheron Stone", 49, 'f',
                LocalDate.of(1969, 03, 15),true, true);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
