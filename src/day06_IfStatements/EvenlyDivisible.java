package day06_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 15;

        boolean divisibleBy_2 = number % 2 == 0;
        //if remainder of number divided by 2 is 0 then it is evenly divisible by 2
        boolean divisibleBy_3 = number % 3 == 0;
        //if remainder of number divided by 3 is 0 then it is evenly divisible by 3
        boolean divisibleBy_5 = number % 5 == 0;
        //if remainder of number divided by 5 is 0 then it is evenly divisible by 5

        System.out.println(number + " is divisible by 2: " + divisibleBy_2);
        System.out.println(number + " is divisible by 3: " + divisibleBy_3);
        System.out.println(number + " is divisible by 5: " + divisibleBy_5);

    }
}

/*
3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero
 */
