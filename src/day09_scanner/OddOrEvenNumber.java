package day09_scanner;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        String result = "Odd number";

        result = (number%2==0)? "Even Number" : "Odd Number";

        System.out.println(result);

        input.close();

    }
}
