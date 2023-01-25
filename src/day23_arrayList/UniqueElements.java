package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeya"); // 2
        names.add("Sumeya"); // 3
        names.add("Ali"); // 4
        names.add("Sumeya"); // 5
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        //first we need to access each element
        for (String each : names) { //each: each element on the array "names"
        // we need to verify if element is unique
/*      if the position of the 1st time it has occurred (indexOf() ) equals the position last time it has occurred
        (lastIndexOf() ) it means it is unique. indexOf() methods checks from left to right and how any times each element
        repeats, lastIndexOf() checks from right to left to see how many times each element repeats. When both return
        the same result that element is unique. If the first occurrence is the same with the last occurrence  == UNIQUE
*/
            if (names.indexOf(each) == names.lastIndexOf(each)  ){
                System.out.println(each);
            }

        }



    }
}
