package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // DataType variableName = Data

        // byte a = "Java"; //byte only accepts integer values from -128 to 127
        // byte a = 20.5; //byte cannot take decimal numbers
        // byte a = 2000; // it is out of byte range
        byte a = 20;

        // price of a car is $17,500

        short p = 17500;

        System.out.println(p);  //to call a declared variable you should use it without quotes

        //salary is $95000
        int s = 95000; // preferred data type

        System.out.println(s);

        // int n = 99999999999; //not accepting as it is requiring int type
        long n = 99999999999L; //to forcefully make it accept the data we add Lor l at the end

        //GPA is 3.5
        double GPA1 = 3.5; // preferred type for all decimals

        float GPA2 = 3.5F; // adding F (float) to forcefully accept it as float


    }

}
