package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_Keyword {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150){
            //System.err.println("Invalid age: "+age);
            //System.exit(1);
            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative: "+age);
            }else {
                throw new InputMismatchException("Age is grater than 150: "+age);
            }
        }

        System.out.println("--------------------------------------------------------");

        //throw new RuntimeException("Runtime exception");
        //System.out.println("Hello world");

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
