package day10_string;
import java.util.Scanner;
import java.lang.String; //in 'lang' package there is 'String' class
import java.lang.System; //in 'lang' package there is 'System' class


public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        String s1 = "Cat";
        String s2 = "Cat";

        System.out.println(s1 == s2);
        System.out.println("-----------------------------------------------");

        //2. create string with 'new' keyword. 'new' creates new memory inside Heap
        //it creates 2 objects inside Heap, 1 in the string pool, 2nd in heap outside string pool
        String str1 = new String( "Java");
        String str2 = new String( "Java");

        System.out.println(str1==str2);
        System.out.println("-----------------------------------------------");

        String t1 = "Python"; //this will be added to the Heap's string pool
        String t2 = new String("Python"); //this will be added to the HEap, outside string pool
        String t3 = new String("Python"); //

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);

        System.out.println(t1==t2);
        System.out.println(t3==t2);








    }
}
