package day32_finalKeyword;

import java.time.LocalDate;

class Student { //final classes cannot be extended

    public final void language(){ //this method will never be overridden or change
        System.out.println("Java programming");
    }


}


public final class FinalKeyword extends Student{ //sub class of Student class
/*
    public void language(){ //final methods can never be overridden
        System.out.println("Python programming");
    }
*/
    public FinalKeyword(){ //not applicable to constructors

    }

    public static void main(String[] args) {

        final char gender = 'M'; //final keyword prevents 'gender' to be reassigned

        System.out.println(gender); //'M'

        //gender = 'F';

        System.out.println(gender); //'F'

        System.out.println("=================================================");


        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth); //current month/current day/current year

        //dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth); //current month/current day/current year +1
        System.out.println("=================================================");

        new Student().language();
        new FinalKeyword().language();

        System.out.println("=================================================");

        final String name = "James";

        //name = null;
        //name = "Mike";

        System.out.println(name);





    }
}
