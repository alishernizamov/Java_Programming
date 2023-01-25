package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2_147_483_647; // any number use enters will ALWAYS be LESS than this 2_147_483_647 number

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            int num = input.nextInt();  //20 30 -5 100 200

            if (num < min){ //if user entered num is less than the current minimum that we have
                min = num;  //then user entry will become the minimum number
            }
        }
        System.out.println("min :"+min  );

        input.close();

    }
}
