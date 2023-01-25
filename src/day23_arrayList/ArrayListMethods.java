package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        //in order t update an element of an array use set90 method
        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("------------------set()--replaces-an-element---------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper towel");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        //groceriesList[2] = "Oranges";
        groceriesList.set(2, "Oranges");

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);
        System.out.println("-----------remove()------------------");

        //remove() method - it removes an element, decreases the size of an array
        groceriesList.remove(0);
        System.out.println(groceriesList); //[paper towel, Chicken, Oranges, Cooking oil]
        groceriesList.remove("paper towel");
        System.out.println(groceriesList); //[Chicken, Oranges, Cooking oil]

        System.out.println("-----------remove()------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //index: 0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4

        //In order to pass an integer object into the remove() method you need call the valueOf() method from the
        // wrapper class. If you pass directly an integer object the remove() method will treat it like an integer i.e. index
        //numbers.remove( Integer.valueOf(10) );
        boolean r1 = numbers.remove( Integer.valueOf(10) ); //or you can use it as a boolean to see if the element
                                                               //was removed

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear(); //this will clear the list array

        System.out.println(numbers); //[]



    }
}
