package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if (number < 1 || number > 7){
            System.err.println("Invalid number");
            return; //if the condition is met, it will exit the main method
        }

        System.out.println(  (number == 1 )? "Mon" :(number==2)? "Tue" :(number==3)? "Wed"
                :(number==4)? "Thu" :(number==5)? "Fri" :(number==6)? "Sat" : "Sun");

    }
}
