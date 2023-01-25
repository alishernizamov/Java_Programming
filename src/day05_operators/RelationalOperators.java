package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

        //System.out.println( a > b );
        boolean aIsGreater = a > b;
        System.out.println("aIsGreater = " + aIsGreater);

        System.out.println("-----------------------------------------------");

        // Operator >=
        int score = 50;
        boolean passed = score >= 60;
        System.out.println("passed = " + passed);
        System.out.println("-----------------------------------------------");

        int age = 21;
        boolean eligibleToDrive = age >= 21;
        System.out.println("eligibleToDrive = " + eligibleToDrive);

        boolean eligibleToVote = age >= 18;
        System.out.println("eligibleToVote = " + eligibleToVote);
        System.out.println("--------------- >= ----------------------------");

        System.out.println( 100 > 100 ); // false
        System.out.println( 100 >= 100 ); //true
        System.out.println( 100 >= 85 ); //true
        System.out.println("----------------- < -------------------------");

        //We will use the score variable. Since it was already declared we cannot declare it again, but re-assign it with
        // a new value, see below. The new value of 'score' is now 48
        score = 48;

        boolean failed = score < 60;
        System.out.println("failed = " + failed);
        System.out.println("---------------- <  ---------------------------");

        System.out.println( 100 < 2000 ); //true
        System.out.println( 100 < 20 ); //false
        System.out.println("---------------  <=  --------------------------");

        System.out.println( 95 <= 100 );

        System.out.println( 100 <= 100 );

        System.out.println( 10 <= 5 );
        System.out.println("-----------------------------------------------");

        System.out.println( 'a' < 'b' ); //ASCII numbers
        //                   97    98

        //System.out.println( "Java" <= "C#" ); //>, <, >=, <=, can only be applicable to numbers







    }
}
