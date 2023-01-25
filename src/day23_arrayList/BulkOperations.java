package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);


        //list1.addAll(numbers); //it adds all 'numbers' list into list1. It adds from the end of the existing one (3).

        System.out.println(list1);

        list1.addAll(1, numbers);

        System.out.println(list1);

        System.out.println("----------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(758,85,95,70,80));

        System.out.println(scores);

        System.out.println("-----------------String------------------------");

        ArrayList<String> students = new ArrayList<>();
        //students.addAll("Gadir", "Hasan", "Abidullah", "Bilal"); //to add these elements as one array you need to call
        // the asList() method. See below
        students.addAll( Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal") ); //it is now a list

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeya", "Tatiana") ); //it will pass this into index 2, but the original element will shift to right

        System.out.println(students);

        System.out.println("-------------------asList()----------------------------");

        //convert array to a array list, make sure the array is a non primit array (Integer==nonprim, int==prim),
        // bc collection does not support prims
        Integer[] nums = {1,2,3,4,5,6,7,8,};

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums) ); // ----> second way

        //you cannot directly creat an array list from a non prim array. asList accepts collection type.
        //nums is not a collection type. Array is not a collection. You call Arrays.asList() to be able to pass the array into
        //an arrayList
  //    l1.addAll( Arrays.asList(nums)  ); //-->> one way

        System.out.println(l1);

        System.out.println("-------------------containsAll----------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll( Arrays.asList( "Alena", "Muhtar", "Gadir", "Ali" ) );

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");

        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));

        boolean hasMuhtarAliKuzzat = employeesList.containsAll( Arrays.asList("Muhtar",  "Ali", "Kuzzat") );

        System.out.println("has Alena "+hasAlena);
        System.out.println("has Alena and Gadir "+hasAlenaGadir);
        System.out.println("has Muhtar, Ali, Kuzzat "+hasMuhtarAliKuzzat);

        System.out.println("----------------removeAll()-------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20) );

        list.removeAll( Arrays.asList(10,20) );

        System.out.println(list); //[30, 40, 50, 60, 70] all 10s and 20s were removed

        System.out.println("----------------retainAll()-------------------------------");
        //retainAll() keeps the matching elements and remove all the not matching ones
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll( Arrays.asList( "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madivar", "Alena", "Muhtar", "Muhtar" ) );

        developers.retainAll( Arrays.asList("Alena", "Khashayar", "Muhtar"));

        System.out.println(developers);

        System.out.println("-----------------------------------------------");
        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towel"  )
        );

        groceriesList.retainAll(Arrays.asList( "Eggs", "Potato", "Milk", "Tomato")); //removes all non matching elements
   //   groceriesList.removeAll( Arrays.asList( "Rice", "Orange", "Strawberry", "Blueberry", "Paper towel"  ) ); //removes all matching elements

        System.out.println(groceriesList);


    }
}
