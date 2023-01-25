package day19_array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin"; //fist index
        myGroup[myGroup.length-1] = "Aseel"; //last index
        myGroup[2] = "Sumeye";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashavac";

        myGroup[1] = "Kuzzat"; //value in index 1 was reassigned to name Kuzzat

        System.out.println(Arrays.toString(myGroup));
        System.out.println("------printelements in Array in reverse order---------------------------");

        for (int i = myGroup.length-1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("--------------------------------------------------");

        //shortcut for creating for loop (starting from index 0 to the last index) for an array: type 'variable_name.for' and enter
        for (int i = 0; i < myGroup.length; i++) {            
        }
        //shortcut for creating a reverse iteration for an arrays type: 'variable_name.forr'
        for (int i = myGroup.length - 1; i >= 0; i--) {
        }




    }
}
