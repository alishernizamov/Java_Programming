package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        //repeat the entry request for 10 times. Here it will ask a user to input a number for 10 times. Stops after the 10th entry
        for (int i = 0; i < 10; i++) { //shortcut for for(i) i  type 'fori' and enter
            System.out.println("Enter a number:");
            int num = input.nextInt();
        }
*/
        int sum = 0;
        //get the sum of 10 entries or 5 entries (depending on the 'condition' set)
        for (int i = 0; i < 10; i++) {
            sum += input.nextInt();
        }
        System.out.println(sum);

        input.close();



    }
}
