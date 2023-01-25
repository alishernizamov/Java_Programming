package day05_operators;

public class RelationalOperators2 {
    public static void main(String [] args){

        //== - equal
        System.out.println( 1000 == 2000 ); //false
        System.out.println( "Java" == "Java" ); //true
        System.out.println( "Java" == "java" ); //false - both sides are not equal
        System.out.println( "Muhtar" == "is a good guy" );
        System.out.println( true == false ); //false
        System.out.println("-----------------------------------------------------");

        //!= - not equal
        System.out.println( 1000 != 2000 ); //true
        System.out.println( "Java" != "Java" ); //false
        System.out.println( "Java" != "java" ); //true - both sides are not equal
        System.out.println( "Muhtar" != "is a good guy" ); //true
        System.out.println( true != false ); //true


    }
}
