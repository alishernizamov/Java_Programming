package day14_forLoop;

import java.sql.SQLOutput;

public class ForLoopPractice {
    public static void main(String[] args) {

        for( int i = 5; i <= 10; i++ ){ //when the iterator is set to not resulting false (ex. i--) and loop will run infinitely

            System.out.println("hello Cydeo");
        }

        // THIS IS A BACKWARDS DIRECTION OF LOOPING
        //each time the iteration will be decreased by 1
  /*
        for( int i = 10; i >= 5; i-- ){ //i: 10, 9, 8, 7, 6, 5, 4
            System.out.println("Hello Cydeo" + i); //1, 2, 3, 4, 5, 6
        }
*/
        System.out.println("----------------------------------------");

        //sum of all numbers bw 1-100
        int sum = 0;

        for(int i = 1; i <= 100; i++ ){ //this sums all numbers from 1 to 100
            sum += i; //keeps adding 1 to 'i' which is 1
        }
        System.out.println(sum);


        //print all characters bw A-Z

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " \n");
        }
        System.out.println(); //added an empty print to add a new line bw the alphabet and "Hello"
        System.out.println("Hello");

        //print alphabet backwards
        for (char d = 'Z'; d >= 'A'; d--){ //we are going reverse ABC. Iteration subtracts 1 on every loop
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("Hello backwards ABC");



    }
}
