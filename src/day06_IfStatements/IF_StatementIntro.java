package day06_IfStatements;

public class IF_StatementIntro {
    public static void main(String[] args) {

        int number = -100;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if (isPositive) {
            System.out.println(number + " is positive");
        }

        if (isNegative) {
            System.out.println(number + " is negative");
        }

        if (isZero) {
            System.out.println(number + " is zero");

        }
        System.out.println("------------------------------------------------------------------");

        int num = 100;

        if (num > 0){

            System.out.println(num + " is a positive number.");
        }

        if (num < 0) {
            System.out.println(num + " is a negative number.");

        }

        if (num == 0){
            System.out.println(num + " is zero.");
        }

    }
}
