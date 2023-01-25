package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class PersonTestObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Aleksandr", 12, 'm', LocalDate.of(2022,12,1));

        System.out.println(person1);
    }
}
