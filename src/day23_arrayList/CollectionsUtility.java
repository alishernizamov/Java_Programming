package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8) );

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max "+max);
        System.out.println("min "+min);

        System.out.println("-----------------------------------------------------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towel"  ));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("-------------------------reverse()----------------------------------------------------------");

        Collections.reverse(items);

        System.out.println(items);

        System.out.println("-------------------------swap()------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll( Arrays.asList( "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madivar", "Alena", "Muhtar", "Alisher" ) );

        System.out.println(students); //[Alena, Muhtar, Gadir, Ali, Khashayar, Madivar, Alena, Muhtar, Muhtar]

        Collections.swap(students, 0, 1); //element in ndex 0 will be swapped with element in index 1

        System.out.println(students); //[Muhtar, Alena, Gadir, Ali, Khashayar, Madivar, Alena, Muhtar, Muhtar]

        Collections.swap(students,0, students.size()-1); //swap 1st and last element

        System.out.println(students);



    }




}
