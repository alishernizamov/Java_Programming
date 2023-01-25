package day40_collection;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        System.out.println("-----------------------PriorityQueue----------------------------");

        Queue<Integer> queue1 = new PriorityQueue<>(); //random order, doesn't accept null
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        //queue1.addAll(Arrays.asList(null, null, null));

        System.out.println(queue1);
        // output: [10, 10, 10, 40, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200, 90]

        int num1 = queue1.poll(); // FIFO

        System.out.println(queue1);
        // output: [10, 40, 10, 90, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200] - missing 1st element "10"

        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);

        System.out.println("-----------------------ArrayDeque----------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);

        System.out.println("-----------------------LinkedList----------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); //keeps insertion order, has index nums, accepts null

        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null, null));

        System.out.println(queue3);

        queue3.poll();

        System.out.println(queue3);


        System.out.println("-----------------------LIST----------------------------");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list.get(1)); //displays the 2nd element (index1)

        System.out.println(list);

        ( (LinkedList)list ).poll(); //FIFO, in order to use poll(), we have to downcast to linkedList

        System.out.println(list);

        //( (Stack) list).pop(); //does not have IS relation with Stack


    }
}
