package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        //pre increment / decrement
        int x = 10;

        System.out.println( ++x ); //increment means it adds 1 to the operand x, it will be 11
        System.out.println(x);

        int y = 100;

        System.out.println( --y );
        System.out.println(y);

        System.out.println("-------------------------------------------------");

        //post increment/decrement  the operator '--' is placed after operand
        int b = 25;

        System.out.println( b-- );

        int n = 30;
        int m = n++; //m = 30, n = 31

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z--; //q = 60, z = 59

        System.out.println("z = " + z);
        System.out.println("q = " + q);

    }
}
