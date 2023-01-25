package day15_whileLoop;

import java.util.Scanner;

public class Calculator_WL {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user entry check
        System.out.println("Enter your 1st number:");
        double num1 = input.nextDouble();

        System.out.println("Enter your 2nd number:");
        double num2 = input.nextDouble();

        System.out.println("Enter a math operator:");
        char operator = input.next().charAt(0);

        while ( ! (operator == '+' || operator == '-' || operator == '*' || operator == '/')  ){
            System.err.println("Invalid operator! Please re-enter the math operator");
            operator = input.next().charAt(0);
        }

        //once the user has provided valid entries, below block is executed
        if(operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else{
            System.out.println(num1/num2);
        }



    }
}
