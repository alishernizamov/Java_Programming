package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        
        //assignment operator '='
        int a = 20;
        System.out.println( a ); //20
        System.out.println( a ); //20
        a = 40;
        System.out.println( a );
        a = 90;
        System.out.println( a );
        System.out.println("-----------------------------------");
        
        //addition assignment +=
        double balance = 100;
        balance += 1000; //balance will be reassigned to old value (100) plus the new value (1000)
        System.out.println("balance = " + balance);

        balance += 500; // balance = 1100 + 500
        System.out.println("balance = " + balance);

        balance += 10000;
        System.out.println("'balance' = " + balance );

        balance -= 1000;
        System.out.println("balance = " + balance); //balance = 11,600 - 1,000

        balance -= 1000;
        System.out.println("balance = " + balance);
        System.out.println("---------------------------------------");

        //multiplication assignment *=
        double salary = 45_000;

        salary *= 2; //salary = 45,000 *2
        System.out.println("salary = " + salary);

        salary *= 3;
        System.out.println("salary = " + salary);
        System.out.println("---------------------------------------");

        double eth = 4;
        eth *= 250;

        System.out.println("eth = " + eth);

        //division assignment
        eth /= 2;
        System.out.println("eth = " + eth);

        System.out.println("---------------------------------------");

        System.out.println("salary = " + salary);

        salary /= 2;
        System.out.println("salary = " + salary);

        System.out.println("---------------------------------------");

        //modulus (remainder) assignment operator


    }
}
