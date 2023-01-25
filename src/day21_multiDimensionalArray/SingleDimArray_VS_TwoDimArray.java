package day21_multiDimensionalArray;

import java.util.Arrays;

public class SingleDimArray_VS_TwoDimArray {
    public static void main(String[] args) {

        int[] arr1D = new int[10]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        arr1D[0] = 100;

        System.out.println(Arrays.toString(arr1D)); //[100, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //5 1D arrays
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        int[] arr3 = {9,10};
        int[] arr4 = {11,12,13,14,15};
        int[] arr5 = {16,17,18,19,20,21};


        int[][] arr2D = new int[5][]; //index 0 4, here you can have 5 1D arrays

        //we are assigning the 5 1d arrays to the 2D array
        arr2D[0] = arr1; //index 0
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;


        System.out.println(Arrays.deepToString( arr2D)); //[[1, 2, 3, 4, 5], [6, 7, 8], [9, 10], [11, 12, 13, 14, 15], [16, 17, 18, 19, 20, 21]]




    }
}
