package utilities;

import java.util.Arrays;

public class TesObjects {
    public static void main(String[] args) {

        int[] array = {10, 10, 20, 30, 40, 30, 30, 30};
        double[] arrayD = {10.5, 10.35, 20.85, 30.50, 40.69, 30.55, 30.87, 30.99};
        char[] arrayC = {'a', 'b', 'c', 'd', 'e'};
        String[] cars = {"BMW", "Honda", "Audi", "VW"};
/*
        int[] arr2 = ArraysUtility.replaceAll(array,20,152);

        System.out.println(Arrays.toString(arr2));

        double[] arrayD2 = ArraysUtility.replaceAll(arrayD,10.35, 199.456);

        System.out.println("double arrayD2: "+Arrays.toString(arrayD2));

        char[] arrayC2 = ArraysUtility.replaceAll(arrayC,'a','A');

        System.out.println(Arrays.toString(arrayC2));

        String[] cars2 = ArraysUtility.replaceAll(cars, "VW", "Volkswagen");
        System.out.println(Arrays.toString(cars2));


        int[] array2 = ArraysUtility.insert(array, 1, 505);

        System.out.println("Array2 "+Arrays.toString(array2));

        double[] newArrayD = ArraysUtility.insert(arrayD,2,200000.568);

        System.out.println("newArrayD: "+Arrays.toString(newArrayD));

        char[] newArracyC = ArraysUtility.insert(arrayC, 3,'D');

        System.out.println("newArracyC: "+Arrays.toString(newArracyC));

        String[] cars2 = ArraysUtility.insert(cars, 1,"Toyota");
        System.out.println("cars2: "+Arrays.toString(cars2));
*/

        int[] arr3 = ArraysUtility.swapElements(array,2,5);
        System.out.println("arr3: " + Arrays.toString(arr3) );

        double[] arrayD4 = ArraysUtility.swapElements(arrayD,3,1);
        System.out.println("arrayD4: "+Arrays.toString(arrayD4));

        char[] arrayC4 =  ArraysUtility.swapElements(arrayC,2, 4);
        System.out.println("arrayC4: " + Arrays.toString(arrayC4));



    }
}
