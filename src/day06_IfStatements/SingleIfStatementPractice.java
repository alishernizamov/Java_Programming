package day06_IfStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 == 0;
        //boolean isOdd = number % 2 != 0;
        //boolean isOdd = !isEven;

        if (isEven) {
            System.out.println("Even number");
        }

        if (!isEven) {
            System.out.println("Odd number");
        }
        System.out.println("----------------------2nd option---------------------------");
        if (number % 2 == 0) {
            System.out.println("Even Number");
        }
        if (number % 2 != 0) {
            System.out.println("Odd number");
        }
    }
}
/*
Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20
			output:
				20 is an even number: true
				20 is an odd number: false
		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */