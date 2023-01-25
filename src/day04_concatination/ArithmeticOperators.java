package day04_concatination;

import java.sql.SQLOutput;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println( "100" + 200); //'+' acts here as a concat operator bc there's string "100"
        System.out.println(100 + 200); //300 - '+' acts here as an addition operator
        //System.out.println("200" - 10); //Here '-' cannot be used as it is used only as an arithm operator
        System.out.println(200 - 10); //190

        System.out.println(50 / 6.0);
        System.out.println(50. / 6);
        System.out.println(50 / 6);
        System.out.println(50d / 6); //8.333... adding 'd' to the end makes it a double
        System.out.println( (int) (2.5 / 0.5) ); //casting to int type
        //System.out.println(0/0); cannot use 0s as denominator as numerator

        System.out.println(10 * 2);
        System.out.println(20 * 12);

        //-------------Modulus % operator (aka remainder operator)
        System.out.println(10 - (3*3)); //1
        System.out.println( 15 / 4.);
        System.out.println( 15 % 4);
        System.out.println( 10 % 3);
        System.out.println( 20 % 6);

        System.out.println(100 / 13);
        System.out.println(100 % 13);
        System.out.println(100 % 10); //0 since 100 is evenly divisible by 10 with no remainders
        System.out.println( 45 % 8 );

    }
}
