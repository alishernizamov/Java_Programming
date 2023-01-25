package day19_array;

import java.util.Arrays;

public class MinNumber {
    public static void main(String[] args) {

        int[] number = {100, 20, 50, -10, 60};

        int min = number[0];

        for (int i = 0; i < number.length; i++) { //i is index
            if (number[i] < min ){ // i is index
                min = number[i];
            }
        }

        System.out.println("min num: " + min);

    }
}
