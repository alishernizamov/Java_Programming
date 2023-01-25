package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {
        //2 dimensional arrays
        int[][] arr2d1 = { {1,2}, {3,4,5}    };
        int[][] arr2d2 = { {6,7,8,9}, {10,11} ,{12,13,14}   };
        int[][] arr2d3 = { {15,16,17,18} };

        //3 dimensional arrays  0       1               0         1        2                  0
        int[][][] arr3d = { { {1,2}, {3,4,5} } , { {6,7,8,9}, {10,11} ,{12,13,14} } , { {15,16,17,18}  } };
        //index of 2d arrays        0                               1                         2

        //                  COORDINATES:
        //[index of 2D array][index of 1D array][index of elements]

        System.out.println(Arrays.deepToString(arr3d)); // [[[1, 2], [3, 4, 5]], [[6, 7, 8, 9], [10, 11], [12, 13, 14]], [[15, 16, 17, 18]]]

        System.out.println(Arrays.deepToString( arr3d[1] )); //[[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        System.out.println(Arrays.toString(arr3d[0][1])); //[3, 4, 5]

        System.out.println(Arrays.toString( arr3d[1][0] )); //[6, 7, 8, 9]

        System.out.println("-------------------------looping---------------------------");

        for (int i = 0; i < arr3d.length; i++) { //i: index of each 2 dmi arrays (index 0 to the last index)
            int[][] each2DArray = arr3d[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { //j: index of each 1 dim array
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays. toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { //k: index of each element
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);

                }

            }

        }

    }
}
