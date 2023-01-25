package day06_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;

        boolean positiveNumber = number > 0; //if number is greater than 0 then it is a posit number
        boolean negNumber = number < 0; // if number if less than 0, it is neg number
        //boolean isZero = number ==0; //if number is equal to 0
        boolean isZero = !positiveNumber && !negNumber; //if number is not pos AND not neg than it is zero


        System.out.println(number + " is positive number: " + positiveNumber);
        System.out.println(number + " is negative number: " + negNumber);
        System.out.println(number + " is zero: " + isZero);


    }
}

/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */