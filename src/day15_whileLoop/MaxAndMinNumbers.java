package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2_147_483_648;;
        int min = 2_147_483_647; //as soon as user inputs will be less than this

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            int num = input.nextInt();

            //find max nun if statement
            if (num > max){
                max = num;
            }

            //find min if statement
            if (num < min){
                min = num;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        input.close();

    }
}
