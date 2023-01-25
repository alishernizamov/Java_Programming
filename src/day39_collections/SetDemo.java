package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println("list: "+list); //output: list: [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10,
                                           // 200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null, null, null]
        System.out.println("---------------------------------HASHSET-------------------------------");
        Set<Integer> set1 = new HashSet<>(); //order is random
        set1.addAll(Arrays.asList(10,10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println("set1: "+set1); //output: set1: [null, 200, 40, 10, 90, 300]

        System.out.println("---------------------------------LinkedHashSet-------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(10,200,300,40,90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);

        System.out.println("---------------------------------TreeSet-------------------------------");

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        set3.addAll(Arrays.asList(10,200,300,40,90));
        //set3.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set3); //output is sorted in ascending order: [10, 40, 90, 200, 300]

        System.out.println("-------------------RETRIEVING ELEMENTS---------------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python",
                "C#", "C++", "Ruby", "C#", "C#"};

        //we need to remove the dups and show unique list
        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result); //output: [Java, Python, C#, C++, Ruby]

        //convert set 'result' back to list 'words'
        words = result.toArray(new String[0]);
        System.out.println("Words Array: " + Arrays.toString(words));
        //output: Words Array: [Java, Python, C#, C++, Ruby]

        //retrieve elements
        for (String eachElement : result) {
            System.out.println(eachElement);
        }

        //retrieve certain elements (retrieve index 1)
        System.out.println("2nd element (ind1): "+new ArrayList<>(result).get(1));
        //output: 2nd element (ind1): Python


        System.out.println("----------------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40,
                50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));

        //remove the dups and sort them in ascending order
        //solution 1
        Set<Integer> numSet = new TreeSet<>(numbers);
        System.out.println(numSet);

        //solution 2
        System.out.println(new TreeSet<>(numbers));

        //numbers = new ArrayList<>(numSet); //convert to ArrayList



    }
}
