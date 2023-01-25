package day09_scanner;

import java.util.Scanner;

public class EligibleIneligible {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //'input' variable name
        System.out.println("Enter the customer age: ");
        int age = input.nextInt();
        String result = "";

        result = (age >= 1 && age <= 150)?
                (age >= 21 && age <= 150)? "Eligible to buy alcohol" : "Ineligible to buy alcohol"
                : "Invalid Entry";
        System.out.println("result = " + result);
    }

}
