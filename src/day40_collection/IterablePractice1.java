package day40_collection;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {
        System.out.println("--------------------Iterator example------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));

        Iterator<Integer> iterator = list.iterator();

        System.out.println( iterator.hasNext() ); //check if there are iterators: true/false
        System.out.println(iterator.next()); //display iterator element

        System.out.println("-----------------------Iterator using STRING--------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //remove "Ahmad"
        Iterator<String> it = names.iterator(); //to get the Iterator object

        while(it.hasNext()){ //verifies if there are iterables in the list; becomes false when there are no more iterables
            String each = it.next(); //declaring 'each' to represent each iterable; using next() to access each element
            if (each.equalsIgnoreCase("Ahmed")){
                it.remove();
            }

        }

        System.out.println(names);

        System.out.println("-----------------------Iterator using STRING removeIf() 2--------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //remove "Ahmad"
        //Iterator<String> it = names2.iterator(); //to get the Iterator object

        names2.removeIf( p -> p.equalsIgnoreCase("ahmed") );

        System.out.println(names2);

        System.out.println("-----------------------Iterator using int removeIf() 3--------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        //find nth max number

        int n = 5; //find the nth (5th) max number

        for (int i = 0; i < n - 1; i++) { //starts with n & ends with n - 1, runs 4 times by removing 5 elements
            numbers.removeIf( p -> Collections.max(numbers) == p ); //if the number is the max number, remove from the list
        }

        //fori w removeIf() removed the the first 4 max numbers (9,8,7,6)
        int max = Collections.max(numbers); //max number of the remaining list, which is the 5th max number

        System.out.println(max);


    }
}
