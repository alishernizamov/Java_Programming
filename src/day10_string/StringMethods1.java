package day10_string;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        //charAt() method

        String str = "Cydeo";
        // index      01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);
        //char sixthChar = str.charAt(5); //index 5 does not exist as there are only 5 characters: 0-4

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);
        //System.out.println("sixthChar = " + sixthChar);
        System.out.println("--------------------------------------------");
        String sentence = "Java Programming Language";

        int length = sentence.length();

        System.out.println("length = " + length);

        int lastIndex = length - 1;

        System.out.println("lastIndex = " + lastIndex);
        System.out.println("--------------------------------------------");

        //Subtract the 1st and the last character of the string
        String s1 = "Wooden Spoon"; //s1 is a variable name for this string

        char f = s1.charAt(0); //Always the first index is 0, charAt() will return the actual character under index 0

        int lastIndexNum = s1.length()-1; //this will return the last index number of the string s1

        char l = s1.charAt(lastIndexNum); //s1-variable for the string, charAt() will return the character of the last index number

        System.out.println(f + " "+l); //W n
        System.out.println("--------------------------------------------");

        //equal() - compares the strings as values, '==' compares them as objects

        String name1 = "Umran"; //String literal way
        String name2 = new String("Umran"); //using the new keyword

        System.out.println(name1 == name2); //let's compare if they are the same (false)
        System.out.println( name1.equals(name2)); //true

        System.out.println("--------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1 == r2); //true
        System.out.println(r1 == r3); //false
        System.out.println(r1.equals(r3)); //true
        System.out.println(r2.equals(r3)); //true
        System.out.println("--------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen?");
        String answer = input.next();

        if (age >= 21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Ineligible to vote");
        }

        input.close();



    }
}
