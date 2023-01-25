package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonTestObject {
    public static void main(String[] args) {
        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'm', LocalDate.of(1989,2,25));
        people[1].setInfo("Alisher", 'm', LocalDate.of(1976,5,21));
        people[2].setInfo("Damileka", 'f', LocalDate.of(1991,2,8));
        people[3].setInfo("Artyom", 'm', LocalDate.of(1985,6,15));
        people[4].setInfo("Michael Jackson", 'm', LocalDate.of(1960,6,15));


        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        System.out.println("---------------names and DOB-------------------------");
        for (Person each : studentList) {
            System.out.println(each.name+", "+each.dateOfBirth);
        }

        System.out.println("---------remove students older than 55---------------");
        studentList.removeIf( p-> p.age > 55 );

        for (Person each : studentList) {
            System.out.println(each.name+", "+each.age);
        }









    }
}
/*
1. Print name and DOB

2. Remove all the person object with age > 55
 */
