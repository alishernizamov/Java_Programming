package day16_NestedLoop;

import java.util.Scanner;

public class LogIn_DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;

        do {
            System.out.println("Enter user name");
            u = input.next();

            System.out.println("Enter password");
            p = input.next();

        }while( ! ( u.equals("Cydeo") || p.equals("WoodenSpoon")) ); //while the condition is false


    }
}
