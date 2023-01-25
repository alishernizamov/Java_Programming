package day19_array;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        int[] arr1 = new int[100];

/*        //to assign each element with a number
        for (int i = 0, j = 1; i < arr1.length; i++, j++) { //i: index numbers, j: numbers that we want assigned to each element
            arr1[i] = j;
        }

        //to assign each element with number 10
        for (int i = 0, j = 10; i < arr1.length; i++, j+=10) {
            arr1[i] = j;
        }
*/
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("---------------------------from 100 to 1--------------------------");
        
        int[] arr2 = new int[100]; //index: 0 to 99
        //solution 1
        /*
        for (int i = 0, j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }
*/
        //solution 2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = 100 - i;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2) );

    }
}
