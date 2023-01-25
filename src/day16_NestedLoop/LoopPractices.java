package day16_NestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {
        //-------------------FOR LOOP-----------------
        // if you know the iterations use For Loop
        for (int i = 1; i < 6; i++) {            //the variable that is declared within the for_loop (local variable) is used within this block only
            System.out.println("Hello" + i);   //'i' cannot be used outside the block
        }
        System.out.println("--------------------------------");
        //-------------------WHILE LOOP-------(it can do anything For Loop does)----------
        // if repetition of a statement depends on condition, While Loop is the best way. While Loop demands only for a condition
        int j = 0;
        while(j < 5){
            System.out.println("Hello " +j);
            j++;
        }
        System.out.println("--------------------------------");
        //------------------DO WHILE LOOP--------------------
        int k = 0;
        do {
            System.out.println("Hello " +k);
            k++;
        }while(k < 5);

        System.out.println("--------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while(score > 100 || score < 0){ //while the score is invalid

            System.out.println("Invalid score, re-enter your score");
            score = input.nextInt();
        }
        if(score > 60){
            System.out.println("Passed");
        }


    }
}
