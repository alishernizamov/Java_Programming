package day09_scanner;

import java.util.Scanner;

public class DaysInWeeks {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); //use this method if you want to reuse the variable mult times

        System.out.println("Enter the day number: ");
        //int num = new Scanner(System.in).nextInt(); // we can use the Scanner object this way if we need to use the entry once only

        int num = input.nextInt();
        String day = "Invalid";

        if (num >= 1 && num <= 7){

            day = (num == 1)? "Mon" :(num==2)? "Tue" :(num==3)? "Wed" :(num==4)? "Thu" :(num==5)? "Fri" :(num==6)?
                    "Sat" : "Sun";

        }

        System.out.println(day);

        input.close();

    }
}
