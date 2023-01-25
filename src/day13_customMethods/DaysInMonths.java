package day13_customMethods;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if (month <1 || month >12){
            System.err.println("Invalid Month Entry");
            return; //if the criteria is met it terminates the main method
        }

        switch (month){ //1 ~ 12

            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");

        }

    }

    //access modifier (public) and static modifier (static) are not necessary to put
    int addition(int n1, int n2){

        int result = n1 + n2;
        System.out.println(result);
        return result;

    }
}
