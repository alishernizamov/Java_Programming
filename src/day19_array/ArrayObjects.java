package day19_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[0] = 1000; //all references will be updated with index 0 change as they reference each other
        arr2[2] = 3000; //all references will be updated with index 2 change as they reference each other

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------");

        String[] a1 = {"Umran", "Mehmet"};
        a1 = new String[] { "James", "Daniel"};

        System.out.println("Arrays  = " + Arrays.toString(a1) );


    }
}
