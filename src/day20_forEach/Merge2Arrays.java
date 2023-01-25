package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length]; //we set the size of arr3 by adding the lengths of the two
        //arrays and it will have enough capacity to accommodate the two arrays
        int k = 0; //index for arr3 that will merge the two arrays

        //this loop will add the indexes of the 1st array to arr3
        for (int i = 0; i < arr1.length; i++, k++) { //since i is index for each element of arr1,
            arr3[k] = arr1[i];
        }
        //this loop will add the elements of arr2 to arr3
        for (int i = 0; i < arr2.length; i++, k++) { //i: indexes of the 2nd array arr2
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));
        System.out.println("------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};

        int[] a3 = ArraysUtility.merge(a1, a2);

        System.out.println(Arrays.toString(a3));

        System.out.println("------------------------------------");

        double[] b1 = {10.5, 5.5, 3.5, 2.2};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtility.merge(b1, b2);
        System.out.println(Arrays.toString(b3));
        System.out.println("------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'd', 'e'};
        char[] ch2 = {'X', 'y', 'z'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("--------------------------");
        String[] str1 = { "Alpha", "Beta", "C#", "Delta", "Java", "Python" };
        String[] str2 = { "JavaScript", "Ruby", "Swift", "Jack" };

        String str3[] = ArraysUtility.merge(str1, str2);

        System.out.println(Arrays.toString(str3));


    }
}
