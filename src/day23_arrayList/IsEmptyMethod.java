package day23_arrayList;

import java.util.ArrayList;

public class IsEmptyMethod {
    public static void main(String[] args) {

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println(n1.isEmpty()); //false
        System.out.println(n2.isEmpty()); //false

        n1.clear(); //cleared the array list
        n2.clear(); //cleared the array list

        System.out.println(n1.isEmpty()); //true
        System.out.println(n2.isEmpty()); //true


    }
}
