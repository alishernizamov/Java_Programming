package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

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

        return arr3;

    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; //we set the size of arr3 by adding the lengths of the two
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

        return arr3;

    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; //we set the size of arr3 by adding the lengths of the two
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

        return arr3;

    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; //we set the size of arr3 by adding the lengths of the two
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

        return arr3;

    }


    //reverse
    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }


    //add method
    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }

        return false;
    }

    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }

    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }

    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }

    public static int[] replace(int[] array, int index, int newElement) {

        array[index] = newElement;

        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {

        array[index] = newElement;

        return array;
    }

    public static char[] replace(char[] array, int index, char newElement) {

        array[index] = newElement;

        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {

        array[index] = newElement;

        return array;
    }

    //replace all
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }

        }
        return array;
    }

    public static int[] insert(int[] array, int index, int element) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                newArray[i] = element;
                newArray[i + 1] = array[i];
            } else {
                if (newArray[i] != 0) {
                    newArray[i + 1] = array[i];
                } else {
                    newArray[i] = array[i];
                }
            }

        }
        return newArray;


    }


    public static double[] insert(double[] array, int index, double element) {
        double[] newArray = new double[array.length + 1];

        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                newArray[i] = element;
                newArray[i + 1] = array[i];
            } else {
                if (newArray[i] != 0) {
                    newArray[i + 1] = array[i];
                } else {
                    newArray[i] = array[i];
                }
            }

        }
        return newArray;

    }

    public static char[] insert(char[] array, int index, char element) {
        char[] newArray = new char[array.length + 1];

        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                newArray[i] = element;
                newArray[i + 1] = array[i];
            } else {
                if (newArray[i] != 0) {
                    newArray[i + 1] = array[i];
                } else {
                    newArray[i] = array[i];
                }
            }

        }
        return newArray;

    }

    public static String[] insert(String[] array, int index, String element) {
        String[] newArray = new String[array.length + 1];

        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                newArray[i] = element;
                newArray[i + 1] = array[i];
            } else {
                if (newArray[i] != null) {
                    newArray[i + 1] = array[i];
                } else {
                    newArray[i] = array[i];
                }
            }

        }
        return newArray;

    }


    public static int[] swapElements(int[] arr, int i, int j){
        int arr1 = arr[i];

        arr[i] = arr[j];
        arr[j] = arr1;

        return arr;
    }

    public static double[] swapElements(double[] arr, int i, int j){
        double arr1 = arr[i];

        arr[i] = arr[j];
        arr[j] = arr1;

        return arr;
    }

    public static char[] swapElements(char[] arr, int i, int j){
        char arr1 = arr[i];

        arr[i] = arr[j];
        arr[j] = arr1;

        return arr;
    }

    public static String[] swapElements(String[] arr, int i, int j){
        String arr1 = arr[i];

        arr[i] = arr[j];
        arr[j] = arr1;

        return arr;
    }



    //create the below methods
/*
    public static int[] remove(int[] array, int index){

    }

    public static int[] removeDups(int[] array){ //use the 'contains' method above

    }
*/


}

