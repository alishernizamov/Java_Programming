package day16_NestedLoop;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double result = 0;

        System.out.println("Enter the 1st number:");
        double num1 = input.nextDouble();

        System.out.println("Enter the 2nd number:");
        double num2 = input.nextDouble();

        System.out.println("Enter the math operator:");
        char mathOper = input.next().charAt(0);

        switch (mathOper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = 0;
                }
                break;

        }

    }


}

/*
Write a program for a simple calculator
    ask use to enter a number (double)
    ask user to enter a math operator (char +, -, *, /, )
        if use enters invalid operator, repeat the same step until user enters a valid operator
        ask the user to enter the second number (double)
        display calc result
        would you like to continue (Yes/No)
*/

