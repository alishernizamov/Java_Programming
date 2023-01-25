package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
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

        ArrayList<String> nonDup = new ArrayList<String>();

        for (String each : names) {

            if (nonDup.contains(each)){ //if nonDup already contains the element
                continue;               //skip i.e. do not add
            }

            nonDup.add(each); //adds to nonDup array list

        }

        names = nonDup; //we referenced the names variable to the new list and the original names is now eligible for GC

        System.out.println("Names: "+names); //now this will print unique list

        System.out.println("-------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10); //both list1 and list2 will return the same value. They are referencing the same object

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2)); //true, they are referencing the same object

        //these are two different objects
        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1); //[10]
        System.out.println(l2); //[]

        System.out.println(l1 == l2); //false

        System.out.println(l1.equals(l2)); //true

        System.out.println("------------------------------------");
        //equals() method checks the order, although the lists contain the same elements but they are in different order, it will return false

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println(n1.equals(n2)); //false, as they in different index order

    }
}
