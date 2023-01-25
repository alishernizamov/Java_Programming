package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); //integer argument only, not other Wrapping types

        list.add(10); // index: 0, it is wrapped into an integer - autoboxed
        list.add(20); // index: 1
        list.add(30); // index: 2
        list.add(10); // index: 3
       // list.add(5.5);

        System.out.println(list);

        //insert an element (index):
        list.add(1, 15); //this will add 15 to index 1 and the rest of the indexes will shift
                                      // to right

        System.out.println(list);

        list.add(2, 25);

        System.out.println(list);

        System.out.println("------------------------------------------");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Mohammad");
        studentList.add("Abdurasul");
        studentList.add("Abdullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size()); //size: 4 (4 elements)
        System.out.println(studentList);

        //to retrieve an element
        String firstStudent = studentList.get(0);

        String lastStudent = studentList.get( studentList.size() -1 ); //retrieve the last students name

        System.out.println(firstStudent);
        System.out.println(lastStudent);
    }
}
