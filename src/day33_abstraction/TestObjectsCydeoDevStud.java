package day33_abstraction;

import java.time.LocalDate;

public class TestObjectsCydeoDevStud {
    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1989,11,1), "A1", "Zero to Hero",-1);

        System.out.println(student1);


    }
}
