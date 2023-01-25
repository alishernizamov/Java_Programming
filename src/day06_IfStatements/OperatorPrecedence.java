package day06_IfStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3 );

        System.out.println( 7 + 3 - 2 / 2 ); //9
        //                  7 + 3 - 1

        System.out.println( -5 + 2 ); //-3

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A' );
        //                   true == false  &&  "Java" == "Python" || 'a' == 'A'
        //                        false     &&        false        ||    false
        //                                  false ||  false
        //                                        false

        System.out.println( 100 >= 20 && 40 * 2 > 60 );
        //1.                                80  > 60
        //2.                   true            true
        //3.                          true

        //shorthand example

        int a = 20;

        a += 10 + 2 * 3;
        //          6
        //     16
        //20+16 (a = 20)
        //36
        System.out.println(a);




    }
}
