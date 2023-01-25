package day11_string;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = input.nextLine();

        System.out.println("Enter the second string:");
        String second = input.nextLine();

        input.close();

        //if (first > second) - use lenght() method as it converts the strings into numbers by returning their length
        if (first.length() > second.length()){
            System.out.println("first is the longest");
        }else if (first.length() < second.length()){
            System.out.println("second is the longest");
        }else {
            System.out.println("equal");
        }

    }
}
