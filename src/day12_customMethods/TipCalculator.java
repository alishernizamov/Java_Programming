package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No");
        String yesNo = input.next().toLowerCase(); //"YES" ====> "yes"

        System.out.println("Enter the number of people");
        int numOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double amount = input.nextDouble(); //100

        System.out.println("How was the Service Quality (Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%)");
        String service = input.next().toLowerCase();

        input.close();

        //calculate total tip
        double totalTip = (service.equals("excellent"))? amount * .25
                            :(service.equals("great"))? amount * .2
                            :(service.equals("good"))? amount * .15
                            :(service.equals("fair"))? amount * .1
                            : amount * .05;

        double totalToPay = amount + totalTip;

        System.out.println("Number of people entered: "+numOfPeople);
        System.out.println("Total to pay: "+ totalToPay);
        System.out.println("Total tip: "+totalTip);

        if (yesNo.equals("yes")){
            System.out.println("Total per person: " + (totalToPay / numOfPeople));
            System.out.println("Tip per person: " + (totalTip / numOfPeople));
        }

    }

}
/*
10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also be the ability to calculate based on the number of people in the party
    and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */
