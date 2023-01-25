package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);

        //find th frequency



        for (Integer element : list) { //this will get me access to every single element that i will be
                                       //comparing to
            int frequency = 0;
            for (Integer each : list) { //this will compare
                if (each == element){
                    frequency++; //this will count the unique frequency of each element
                }
            }

            if (frequency == 1){
                System.out.println(element);
                break; //exits the loop once it finds the first unique element
            }
        }





    }
}
