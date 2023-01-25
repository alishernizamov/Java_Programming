package day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        //array[5] = 60;


        System.out.println(Arrays.toString(array)); //[10, 20, 0, 0, 0]

        System.out.println("-----------------------------------");

        ArrayList< Integer > list = new ArrayList<>();

        System.out.println(list);//[]
        System.out.println(list.size()); //size: 0
        System.out.println("====================================");





    }
}
