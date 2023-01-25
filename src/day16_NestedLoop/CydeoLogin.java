package day16_NestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name:");
        String u = input.next();

        System.out.println("Enter password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ //if credentials are correct
            System.out.println("You are logged in");
        }else{   //if incorrect

            for (int i = 0; i < 3; i++) {  //condition true is i: 0, 1, 2
                if (i != 2){
                    System.err.println("Incorrect user name or password. Please re-enter");
                }else{
                    System.err.println("This is your last chance. Please re-enter");
                }

                System.out.println("Enter user name:");
                u = input.next();

                System.out.println("Enter password:");
                p = input.next();

                if( u.equals("Cydeo") && p.equals("WoodenSpoon") ){ //if user provides valid credentials
                    System.out.println("You are logged in");
                    break; //this statements make it exit the loop
                }

            }

            if ( ! (u.equals("Cydeo") && p.equals("WoodenSpoon")) ){ //after all three attempts if the u and p are still incorrect
                System.out.println("Your account is locked! Please contact the support team");
            }

        }

        input.close();





        }

    //this is a method that runs once only
    public static void cydeoLogIn(String username, String password){
        if (username.equals("Cydeo") && password.equals("WoodenSpoon") ){
            System.out.println("Logged in");
        }else{
            System.err.println("Invalid credentials");
        }

    }
}
