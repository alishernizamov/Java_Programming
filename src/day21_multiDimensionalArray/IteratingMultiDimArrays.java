package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimArrays {
    public static void main(String[] args) {

        //index              0  1  2      0  1  2  3  4      0  1
        int[][] arr2d = {  {10,20,30} , {40,50,60,70,80} , {90,100} };
        // index:               0                1             2

        for (int i = 0; i < arr2d.length; i++) { //i: index num of 1-dim array

            int[] each1d = arr2d[i];
            System.out.println(Arrays.toString(each1d)); //this is how we iterate (extract) 1d arrays from the mult dim array

            for (int j = 0; j < each1d.length; j++) { //j: index num of elements in each 1d array
                int eachElement = each1d[j];

                System.out.println(eachElement);
            }

        }

        System.out.println("---------------------------------------for each loop------------------------");

        for( int[] each1dArray : arr2d ){
            System.out.println(Arrays.toString(each1dArray)); //prints every single 1d arrays

            for (int eachElement :  each1dArray){
                System.out.println(eachElement);
            }
        }
        System.out.println("--------------for-loops--retrieve-all-elements----------------------");

        //this is how to retrieve each element from each 1d arrays in the mult-d array
        for (int i = arr2d.length - 1; i >= 0; i--) {
            for (int j = arr2d[i].length - 1; j >= 0; j--) {
                System.out.print(arr2d[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------for-each-loops------------------------");
        for (int[] each1dArray : arr2d) {
            System.out.println(Arrays.toString(each1dArray));

        }

    }
}
