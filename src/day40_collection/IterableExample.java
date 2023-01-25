package day40_collection;

import java.sql.SQLOutput;
import java.util.*;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4,
                5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

/*
        for (Integer each : list) {
            if (each < 5){
                list.remove(each);
            }
        }


        for (int i = 0; i < list.size(); i++) { //i: index
            if (list.get(i) < 5){
                list.remove(i);
            }
        }
*/
        System.out.println(list); // output: [2, 4, 5, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7]

        System.out.println("--------------------ITERATOR with WHILE LOOP-(preferred method_2)-----------------------");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
                6, 7, 1, 2, 3, 4, 5, 6, 7));

//              data type       ref var
        Iterator<Integer> it =  list2.iterator();

        while(it.hasNext()){ //next() tells us if the list2 has iterables; is true as long there is iterable, becomes false when no more iterable
            Integer each = it.next(); //this will get us every single element in the collection
            if (each < 5){
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("-----------------------ITERATOR with FOR_I LOOP-----------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
                6, 7, 1, 2, 3, 4, 5, 6, 7));
        //task remove all that are < 5
        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {
            Integer each = i.next(); //next() returns the element

            if (each < 5){
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("------------------------ITERATOR with removeIf()-(preferred method_1)-------------------");

        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
                6, 7, 1, 2, 3, 4, 5, 6, 7));

        list4.removeIf( p-> p <5 ); //p represents each element of list4

        System.out.println(list4); //output: [5, 5, 6, 7, 5, 6, 7]

        System.out.println("--------LinkedList------ITERATOR with removeIf()-------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
                6, 7, 1, 2, 3, 4, 5, 6, 7));

        list5.removeIf( p-> p <5 );

        System.out.println(list5); //output: [5, 5, 6, 7, 5, 6, 7]



    }
}
