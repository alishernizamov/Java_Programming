package day40_collection;

import utilities.StringUtility;

import java.beans.PropertyEditorManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                        "reviver", "racecar", "madam")
        );

        System.out.println("------------------REMOVE PALINDROMES--with-FOR-LOOP-----------------------------------");
        //program that automatically removes all palindromes from the list
        Iterator<String> it = names.iterator(); //create Iterator object

        while(it.hasNext()){ //check if there are iterables
            String each = it.next(); //each element

            String reverse = "";

            //reverse each element
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse += each.charAt(i);
            }

            //compare each element (each) with the reversed and remove that are palindromes (each = reverse)
            if (each.equalsIgnoreCase(reverse)){
                //names.remove
                it.remove();
            }

        }

        System.out.println(names);


        System.out.println("------------------REMOVE PALINDROMES--with-LAMBDA EXPRESSION---------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                        "reviver", "racecar", "madam")
        );

        names2.removeIf( p -> StringUtility.reverse(p).equalsIgnoreCase(p));

        //this is a solution with the built-in method StringBuilder() to reverse the test
        //names2.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );


        System.out.println(names2);


    }
}
