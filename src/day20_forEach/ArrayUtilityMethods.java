package day20_forEach;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        //toString method - it converts to a string
        int[] score =  { 70,100,80,90,65 } ;

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("--------------------------------");
        //equals method - checks index by index
        //if the order is different then it will return false
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

        char[] ch1 = { 'A', 'B', 'C'   };
        char[] ch2 = { 'A', 'C', 'B'   };

        boolean r2 = Arrays.equals(ch1, ch2);

        System.out.println(r2);

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1, s2)); //returned false as the order was wrong

        int[] nums = {100,80,90,75,88,99,0,5,4,500};

        sort(nums); //sorts in ascending order
        System.out.println(Arrays.toString(nums));

        String[] b1 = {"B", "A", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1); //b1 = {A,B,C}
        Arrays.sort(b2); //b2 = {A,B,C}

        System.out.println(Arrays.equals(b1, b2));

        System.out.println("-------------------------------------");


        String[] students = { "Yaxier", "Madivar", "Ali", "Abdullah", "Alena"   };

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));


        System.out.println("-----------------------------------");

        //copyOf() method

        int[] array =  { 10,20,30,40,50,60,70  };

        int[] array2 = Arrays.copyOf(array, 4); // [10,20,30,40]

        System.out.println(Arrays.toString(array2));


        int[] array3 = Arrays.copyOf(array, 10); // [10, 20, 30, 40, 50, 60, 70, 0, 0, 0]

        System.out.println(Arrays.toString(array3));

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10,11,12};

        int[] n3 = Arrays.copyOf(n1,n1.length+n2.length); //it added the n1 string and created a new length (n1+n2)

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];
        }


        System.out.println(Arrays.toString(n3));
        System.out.println("-----------------------------");

        char[] ch = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
        //index:       0    1    2    3    4    5    6
        char[] result1 = Arrays.copyOf(ch, 20);

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch,2,4+1); //excludes ending index

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length); //starting from index to to the end

        System.out.println(Arrays.toString(result3));




    }
}
