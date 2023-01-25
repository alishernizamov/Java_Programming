package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2_147_483_648; //any number use enters will ALWAYS be greater than this neg 2B number

    //                  boolean
        for (int i = 0;  i < 5;  i++) { //i: 0, 1, 2, 3, 4. When i reaches 5 the condition becomes false and it will stop
            System.out.println("Enter number: ");
            int num = input.nextInt(); // -25, 35, 15, 40, 0

            if (num > max){ // every time a user enters a number the max number will be reassigned to max
                max = num;  //then user entered number should be max number
            }

        }
        System.out.println("max = " + max);

        input.close();
    }


}
/*
Write a program that asks a user to enter 5 numbers and print the max number of all entries
 */