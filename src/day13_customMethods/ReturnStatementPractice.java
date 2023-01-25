package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {
        //using a return statement to exit

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (!isValid){ //if the grade is not valid
            System.err.println("Invalid grade");
            return; //terminates the main method
        }

        System.out.println(    (grade == 'A')? "Excellent"
                :(grade == 'B')? "Great Job"
                :(grade == 'C')? "Good"
                :(grade == 'D')? "Passed"
                : "Failed"    );

    }
}
