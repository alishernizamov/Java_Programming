package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255); //this will add index 3 and shift the existing index to right

        System.out.println(numbers); //

        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i); //to get the elements use get(), it will get each element
            System.out.println(each);
        }

        System.out.println("-----------For-i-Loop-----------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
        System.out.println("-------------For-Each-Loop--------------------");

        for (Integer each : numbers) {
            System.out.println(each);
        }



    }
}
