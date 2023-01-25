package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethod {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList( "Java","Java","Java", "Python", "C#","C#", "Java", "Ruby", "Swift","Swift", "C","Java" ) );

        System.out.println(names);

        //TASK: replace "Java" with "Python"
        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).equals("Java")  ){
                names.set(i, "Python");
            }

        }
        System.out.println(names);

        System.out.println("-------solutions--with--repalceAll()-----------------");

        Collections.replaceAll(names, "Java","Python");

        System.out.println(names);

        System.out.println("-------------frequency()----------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList( 10,20,30,40,50,60,20,20,20,50,50,50,50,50,60,60,60,50,50,80,80,90,90 ));

        int count = Collections.frequency(list, 50);

        System.out.println(count);

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll( Arrays.asList( "Java","Java","Java", "Python", "C#","C#", "Java", "Ruby", "Swift","Swift", "C","Java" ) );

        int countJava = Collections.frequency(names2, "Java");

        System.out.println(countJava);

        System.out.println("----------------frequency()---in--the--loop-------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList( 10,20,30,40,50,60,20,20,20,50,50,50,50,50,60,60,60,50,50,80,80,90,90 ));

        for (Integer each : numbers) { //each: each element
            if (Collections.frequency(numbers, each) == 1){ //if frequency equals to 1 then it is unique
                System.out.println(each);
            }
        }



    }
}
