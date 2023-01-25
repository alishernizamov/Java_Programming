package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //size is 10 (index 0 to 9)

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]%2==0){ //this skips the even numbers
                continue;
            }

            numbers[i] = numbers[i] * 2; //this will now apply the multiplication to odd numbers only

        }


        System.out.println(Arrays.toString(numbers));


    }
}
/*
change all odd numbers
 */