package day38_exceptions;

import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        System.out.println("Hello Cydeo");

        //Thread.sleep();

        Library.sleep(3.5);

        System.out.println("How are you today?");

        System.out.println("---------------------------------------------------");

        if (LocalTime.now().equals(LocalTime.of(6,54))){
            throw new BreakTime_Exception();
        }

        System.out.println("---------------------------------------------------");

        throw new BreakTime_Exception("Time to go home");


    }
}
