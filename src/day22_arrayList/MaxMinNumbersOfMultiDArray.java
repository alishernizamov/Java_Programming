package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {
    public static void main(String[] args) {
        //                  0   1    2      0    1    2      0    1   2
        int[][] array = { {100, 20000, 300}, {10, 1000, 50}, {-200, 400, 0}  }; //indexes of arrays: 0 to 2
        //index of 1D array      0               1                2
        //find max and min numbers

        int max = array[0][0]; //to get to the 1st element in the string
        int min = array[0][0];

        for ( int[]  each1D   :  array   ){
            for (int eachElement : each1D) {
                if(eachElement > max){
                   max = eachElement;
                }
                if (eachElement < min){
                    min = eachElement;
                }

            }
        }

        System.out.println("maximum number is = " + max);
        System.out.println("minimum number is = " + min);


    }
}
