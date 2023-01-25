package day06_IfStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 75;

        boolean evenNumber = number % 2 == 0; //if divide the number by 2, if remainder is 0 it means it is even number
        //boolean oddNumber = number % 2 != 0;
        boolean oddNumber = !evenNumber; //if number is not even then it is odd

        System.out.println(number + " is an even number: " + evenNumber);
        System.out.println(number + " is an odd number: " + oddNumber);

    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20
			output:
				20 is an even number: true
				20 is an odd number: false
		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */