package day09_scanner;

import java.util.Scanner;

public class NextLine_VS_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");

        int age = input.nextInt(); //45+Enter
        input.nextLine();

        System.out.println("Enter your full name:");

        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        input.close();

    }
}