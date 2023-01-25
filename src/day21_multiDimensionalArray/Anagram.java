package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart"; //sort: "aehrt"
        String str2 = "earth";

        //String[] a1 = str1.split("");  //this is one way

        char[] a1 = str1.toCharArray(); //convert the string into an array
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1); //sort both array strings
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1, a2); //creat a boolean by comparing the two strings

        System.out.println("isAnagram = " + isAnagram); //true if both strings have the same letters

    }
}

/*
Task is to check if the strings are built with the same letters (anagram)

    ex: str1 = "heart";
        str2 = "earth";

    output:
        true
 */
