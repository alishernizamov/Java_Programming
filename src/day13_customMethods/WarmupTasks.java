package day13_customMethods;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {

        calculate(12,31,'-'); //you can pass a variable instead of the numbers
        calculate(12, 4, '*');
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 numbers and a math operator");
        double n1 = input.nextDouble(), n2 = input.nextDouble();
        char operator = input.next().charAt(0);

        calculate(n1, n2, operator);

*/
        System.out.println("-----------------------------------------");

        ageGroup(75);

        eligibleToVote(18,true);


    }
    //method to calculate three arguments
    public static void calculate( double num1, double num2, char mathOperator ){ //in order to build a method you need to analyze the task

        double  result = 0;

        switch(mathOperator){   //we will use switch for this method
            case '+': result = num1 + num2;
                //System.out.println(num1 +" + " + num2 + " = " + result);
                System.out.println(num1 +" + " + num2 + " = " + (num1 + num2)); //for this option we don't need to declare variable 'result'
                break;

            case '-':
                System.out.println(num1 +" - " + num2 + " = " + (num1 - num2));
                break;

                case '*':
                System.out.println(num1 +" * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 +" / " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid operator: "+mathOperator);
        }

    }

    //method - age group
    public static void ageGroup(int age){

        if (age >= 0 && age <= 150){

            System.out.println( (age<=21)? "Teenager" :(age<55)? "Adult" :"Senior");

        }else{
            System.out.println("Invalid age: "+age);
        }

    }

    //eligible to vote
    public static void eligibleToVote ( int age, boolean isAmerican ){
        if ( age >= 18 && isAmerican ){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Ineligible to vote");
        }
    }


}
