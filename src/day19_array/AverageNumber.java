package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");

        int total = input.nextInt();

        int[] numbers = new int[total];
        int sum = 0;
        for (int i = 0; i < total; i++) { //total: length of the array
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt(); //user's entry will be reassigned to 'numbers'
            sum += numbers[i];

        }

        double average = sum / (double) total;

        //in order to round up the result to 2 decimals we need to use the decimal Formatter method
        DecimalFormat df = new DecimalFormat("0.00");




        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("average formatted = " + df.format(average));


    }
}
/*
Ask user input
 */