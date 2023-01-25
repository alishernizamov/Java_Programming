package day39_collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); //array-based class ==> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>(); //node-based class (doubly linked) ==> add(), remove(), removeAll(),
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("------------------VECTOR CLASS---------------------------------");

        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);


        System.out.println("--------------------STACK CLASS-------------------------------");
        Stack<Integer> stack = new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);
        stack.add(500);
        stack.add(600);

        System.out.println(stack);

        stack.push(1000); //adds element into the stack

        System.out.println(stack);

        stack.add(0,25);

        System.out.println(stack);
/*
        int lastElement = stack.pop();

        System.out.println(stack);
        System.out.println("Popped element: "+lastElement);
*/
    }
}
