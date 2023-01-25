package day23_arrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        //indexOf() and lastIndexOf()
        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeya"); // 2
        names.add("Sumeya"); // 3
        names.add("Ali"); // 4
        names.add("Sumeya"); // 5

        System.out.println( names.indexOf("Vasyl") );
        System.out.println( names.lastIndexOf("Vasyl") );

        System.out.println( names.lastIndexOf("Sumeya") );




    }


}
