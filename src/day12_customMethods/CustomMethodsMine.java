package day12_customMethods;

import day06_IfStatements.IF_and_ELSE_Practice;

public class CustomMethodsMine {
    public static void main(String[] args) {

        eligibleToPurchaseAlcohol(151);
        numberOddEvenZero(0);
        studentGrade(95);

    }

    public static void eligibleToPurchaseAlcohol(int age){
        //method that checks eligibility of person's age to purchase alcohol
        if (age >0 && age <= 150) {
            if (age > 20) {
                System.out.println("Person is ELIGIBLE to purchase alcohol");
            } else {
                System.out.println("Person is INELIGIBLE to purchase alcohol");
            }

        }else{
            System.out.println("Invalid entry");
        }

    }

    public static void numberOddEvenZero(int number){
        //checks if number is odd/even/zero
        if (number%2 == 0){
            System.out.println("Given number is even");
        }
        if (number%2 != 0){
            System.out.println("Given number is odd");
        }
        if(number == 0){
            System.out.println("Given number is zero");
        }

    }

    public static void studentGrade(int score){
        //calculate grade of a student
        String grade = "";
        if (score > 0 && score <= 100) {
            grade = (score >= 90 && score <= 100) ? "A"
                    : (score >= 80 && score < 90) ? "B"
                    : (score >= 70 && score < 80) ? "C"
                    : (score >= 60 && score < 70) ? "D"
                    : "F";
        }else{
            System.out.println("Invalid entry");
        }
        System.out.println("Student's grade is: " + grade);
    }



} //end of class
/*
    1.  method that can check if a person is eligible to purchase alcohol
        must have: age, data type: int

    2.  method that can check if number is odd/even/zero
        must have info: number, data type: int

    3.  method that calculate grade of a student
        must have: score, data type: int
 */
