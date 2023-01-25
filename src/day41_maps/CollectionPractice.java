package day41_maps;

import day17_customClass.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

    // this is list of list

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<List<Integer>> lists = new ArrayList<>();
        //lists.addAll( Arrays.asList(list1, list2 ));
        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);

        //to get 10 from the list
        System.out.println(lists.get(1)); //(7, 8, 9, 10, 11)

        System.out.println(lists.get(1).get(3)); //10

        //to iterate each element
        for (List<Integer> eachList : lists){
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }

        System.out.println("----------------------------List of SETS----------------------------");
        List<Set> listOfSets = new ArrayList<>(); //the size is 4 (sets)
        listOfSets.add(new LinkedHashSet()); // 0
        listOfSets.add(new LinkedHashSet()); // 1
        listOfSets.add(new LinkedHashSet()); // 2
        listOfSets.add(new LinkedHashSet()); // 3

        System.out.println(listOfSets);

        //add {10, 5, 50} to the first set

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));

        System.out.println(listOfSets);

        //add {10, 5, 50} to the 2nd set
        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(1).addAll(Arrays.asList(30,15,30));
        listOfSets.get(2).addAll(Arrays.asList(300,150,40));
        listOfSets.get(3).addAll(Arrays.asList(30000,1,5));

        //List<int[][]> l = new ArrayList<>();
        System.out.println("----------------------------listOFArrays------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};

        List<int[]> listOFArrays = new ArrayList<>();
        listOFArrays.add(arr1);
        listOFArrays.add(arr2);
//
        listOFArrays.get(0)[2] = 35; //(0): 1st element {1,2,3,4}; [2]: 3rd value of the 1st element:3 = update
                                    // the value to 35

        System.out.println(Arrays.toString( listOFArrays.get(0) ));

        System.out.println("----------------------------listOFLists------------------------------");

        List<List<Employee>> teams = new ArrayList<>();



    }
}
