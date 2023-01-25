package day05_operators;

public class LogicalOperators {
    public static void main(String [] args) {
        //example: a person is applying for a loan, a bank will run a few criteria for eligibility
        //&& - AND logical operator, both criteria must be met to be true

        double salary = 60000;
        int creditScore = 650;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        //                             true       &&           true      &&   true
        //AS LONG AS ONE CONDITION IS 'FALSE' THEN IT WILL RETURN FALSE
        //if first condition is FALSE then you don't have to check the rest of the criteria, it will return false

        System.out.println("eligibleForLoan = " + eligibleForLoan);
        System.out.println("-----------------------------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";
        //                          true   &&     true
        System.out.println("eligibleToVote = " + eligibleToVote);

        // || - OR operator - if one of criteria is true then result is true
        String answer = "Maybe";

        boolean validAnswer = answer == "Yes" || answer == "No";
        //                          false      ||     false

        System.out.println("validAnswer = " + validAnswer);
        System.out.println("-----------------------------------------------");

        char grade = 'B';

        boolean passed = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'; //true
        //                  false     OR     true     OR    false     OR     false

        System.out.println("passed = " + passed);
        System.out.println("-----------------------------------------------");

        // ! - NOT operator. It is used to create an opposite condition

        System.out.println( !true );

        String a = "yes";

        boolean yes = a == "yes"; //true
        boolean no = !yes; //false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("-----------------------------------------------");

        int score = 30;

        boolean passed_ = score >= 60;
        boolean failed = !passed_;

        System.out.println("passed = " + passed_);
        System.out.println("failed = " + failed);

        int number = 30;

        boolean rightNumber = number == 30;
        boolean notRightNumber = !rightNumber;

        System.out.println("rightNumber = " + rightNumber);
        System.out.println("notRightNumber = " + notRightNumber);

        System.out.println("-----------------------------------------------");

        System.out.println( true == !false  && false == !true && true != !true );
        //                        true      AND      true     AND      true

    }
}
