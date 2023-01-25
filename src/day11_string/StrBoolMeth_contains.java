package day11_string;

public class StrBoolMeth_contains {
    public static void main(String[] args) {
        //contains() method - case sensitive
        String students = "Hasan Naran Sumeve Natalia";

        boolean hasAhmad = students.contains("Ahmad");

        System.out.println("hasAhmad = " + hasAhmad);

        String sentence = "My fav programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java"); //true, converting to lower case

        System.out.println("hasJava = " + hasJava);
    }
}
