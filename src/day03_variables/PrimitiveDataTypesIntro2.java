package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        // DataType variableName = Data

        char a = '@';
        char b = '!';
        // char ab = 'ab'; //char is a single character data type and surrounded with single quote ' ';

        System.out.println(a);
        System.out.println(b);
        System.out.println("-------------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("-------------------------------------");

        char ch3 = 40000;

        System.out.println(ch3);

        System.out.println("-------------------------------------");

        int sum = 'A' + 'B'; // in ASCII table corresponding number for A is 65 and B is 66, 65+66=131
        System.out.println(sum);

        System.out.println("-------------------------------------");

        // char ch4 = -100;

        System.out.println("-------------------------------------");

        // boolean r1 = 123; // not acceptable as it needs to be a true or false statement
        // boolean r2 = "Java";
        // boolean r3 = 2.5;

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);

    }
}
