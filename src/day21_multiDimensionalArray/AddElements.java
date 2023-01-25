package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array,array.length + 1); //we are adding one more element to the size of 'array'
        //we had to add one more size to accommodate the additional element "90"
        //to assign the element 90 to the array we will assign it to the last element
        new_array[new_array.length-1] = element;
        //       [index we are adding the 90 to]

        System.out.println(Arrays.toString(new_array)); // [10, 20, 30, 40, 50, 60, 70, 80, 90]

        System.out.println("--------------------------------------");

        int[] numbers = {10, 90, 80, 70, 60};

        numbers = ArraysUtility.addElement(numbers,50);

        System.out.println(Arrays.toString(numbers) );

        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5);

        System.out.println(Arrays. toString(nums)); //[1.5, 2.5, 3.5, 4.5, 5.5]

        System.out.println("----------add String array-----");

        String[] students = {"Yasin", "Smeye", "Ermek"};

        String[] students2 = ArraysUtility.addElement(students, "Umran");

        students2 = ArraysUtility.addElement(students2, "Muhtar");

        System.out.println(Arrays.toString(students2));







    }
}
