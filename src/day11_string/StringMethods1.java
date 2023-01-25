package day11_string;

import java.sql.SQLOutput;

public class StringMethods1 {
    public static void main(String[] args) {
        //UPPERCASE AND LOWERCASE METHODS
        String str1 = "CYDEO SCHOOL";

        System.out.println("------------------------------------");

        String word = "Wooden Spoon"; //immutable i.e. never changing

        word = word.toUpperCase(); //WOODEN SPOON

        word = word.toLowerCase(); //wooden spoon

        System.out.println(word);
        System.out.println("----------------------------------------------------");
        System.out.println("--------------trim()--------------------------");

        String str4 = "                       Cydeo School"; //this text has extra spaces (white spaced) in front

        str4.trim(); // "Cyde School" - whites space removed. But str4 still has the white spaces as it is immutable
        str4 = str4.trim(); //reasigning back to str4 will return the text with the white spaces removed

        System.out.println("-------------------------------------------------------");
        System.out.println("-----lastIndexOf()-------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('w'); //this finds the index number of letter 'w'
        System.out.println(index1);

        String s1 = "I Love Java Programming";
        int firstA = s1.indexOf('a'); //finds the index of the first character 'a'
        System.out.println(firstA);
        int secondA = s1.indexOf("a "); //this will look for the 'a' with a space after it "a "

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a Python"); //index number of the second a, returns the index of the first character in the
                                        // lookup value

        System.out.println("-----------------------------------------------------------");
        String w = "Java";
        System.out.println(w.indexOf('a')); //print the index of chr 'a' - search from left to right

        System.out.println(w.lastIndexOf('a')); //print the index of the last char 'a' - search from right to left

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a')); //15
        System.out.println(w2.lastIndexOf('p'));










    }
}
