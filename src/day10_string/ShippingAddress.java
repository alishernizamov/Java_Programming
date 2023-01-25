package day10_string;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ShippingAddress {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); //in memory there is a 'Enter" keystroke

        System.out.println("Enter your full name:");
        String fullName = input.nextLine(); //FULL NAME

        System.out.println("Enter building number:"); //since it is  one word, we can use next()
        String buildingNum = input.next(); //97845 + Enter

        input.nextLine(); //TO CLEAR SCANNER MEMORY
        System.out.println("Enter Street name:");
        String streetName = input.nextLine();

        System.out.println("Enter city name:");
        String city = input.nextLine();

        System.out.println("Enter State");
        String state = input.nextLine();

        System.out.println("Enter zip code:");
        String zip = input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNum = " + buildingNum);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);

        System.out.println("---------------------------");

        System.out.println("Your shipping address is:");
        System.out.println("\t"+ fullName);
        System.out.println("\t"+ buildingNum+" "+streetName);
        System.out.println("\t"+city+", "+state+" "+zip);

        input.close();
    }
}
