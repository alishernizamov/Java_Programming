package day16_NestedLoop;

import java.util.Scanner;

public class Calculator_Muhtar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")){

            System.out.println("Enter the 1st number:");
            double num1 = input.nextDouble();

            System.out.println("Enter the math operator:");
            char o = input.next().charAt(0);

            while( ! ( o == '+' || o == '-' || o == '*' || o == '/' )  ){ //while operator is invalid the statement below will be repeated over and over
                System.err.println("Invalid operator. Please re-enter math operator");
                o = input.next().charAt(0);
            }

            System.out.println("Enter the 2nd number:");
            double num2 = input.nextDouble();

            double result = (o == '+')? num1 + num2 :(o == '-')? num1 - num2 :(o == '*')? num1 * num2 :num1 / num2;

            System.out.println("Result: " + result);

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no") )){
                System.err.println("Invalid entry. Would you like to continue? Yes/No");
                answer = input.next().toLowerCase();
            }

        }

        input.close();


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
