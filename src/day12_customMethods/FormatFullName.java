package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String first = input.nextLine().trim().replace(" ",""); //if the user enters unnecessary spaces trim() removes them
                                                                               //, also replace() removes spaces between letters

        System.out.println("Enter second name: ");
        String last = input.nextLine().trim().replace(" ","");

        input.close();

        first = first.substring(0,1).toUpperCase()             +     first.substring(1).toLowerCase();
        //            extracts the 1st character and capitalizes it.  Extracts the rest of the characters and converts them into lower case
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first+" "+last;

        System.out.println("Full name: " + full_name);

    }

}
/*
7. Write a program that asks user to enter first and last names, and then prints the full name in regular
format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
