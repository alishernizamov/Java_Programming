package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //toCharArray method
        String str = "CydeoSchool";

        //char[] ch = str.toCharArray();   //[C, y, d, e, o, S, c, h, o, o, l]

        //to remove spaces, use replace()
        char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("---------------------------");

        //split() method
        String str2 = "Today is a great day to learn Java";

        String[] words = str2.split(" "); //splits the text with the given parameter

        System.out.println(Arrays.toString(words));

        System.out.println("---------------------------");

        String sentence = "Today is a great day";

        String[] arr = ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(arr));

        String reversedSentence = ""; //"Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] +" ";
        }
        System.out.println(reversedSentence);

    }
}
