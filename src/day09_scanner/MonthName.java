package day09_scanner;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number: ");
        byte number = input.nextByte();
        String result = "Invalid entry";

        if (number >=1 && number <=12){
            switch (number){
                case 1:
                    result = "Jan";
                    break;
                case 2:
                    result = "Feb";
                    break;
                case 3:
                    result = "Mar";
                    break;
                case 4:
                    result = "Apr";
                    break;
                case 5:
                    result = "May";
                    break;
            }
        }

        System.out.println(result);

    }
}
