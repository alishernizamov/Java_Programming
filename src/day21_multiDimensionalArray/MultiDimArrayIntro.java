package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 = {1000, 2000};

        //to manage the data efficiently we need to put the three arrays into one

        //create a 2d array

        //index              0  1  2      0  1  2  3  4      0  1
        int[][] arr2d = {  {10,20,30} , {40,50,60,70,80} , {90,100} , arr4 }; //there are 3 1dim arrays in this array
        // index:               0                1             2

        //what is the length
        System.out.println(arr2d.length); //length: 3

        System.out.println( Arrays.toString(arr2d[1]) ); //[40, 50, 60, 70, 80]
        System.out.println( Arrays.toString(arr2d[2]) ); //[90, 100]
        System.out.println( Arrays.toString(arr2d[0]) ); //[10, 20, 30]

        System.out.println( arr2d[2][0]) ; //90

        System.out.println( arr2d[1][2]) ; //60








    }
}
