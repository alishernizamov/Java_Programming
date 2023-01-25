package day10_string;

import java.util.Scanner;

public class StringMethodEqualsMeth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen?");
        String answer = input.next();

        if (age >= 21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Ineligible to vote");
        }

    }
}
