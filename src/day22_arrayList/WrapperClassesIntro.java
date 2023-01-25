package day22_arrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        String str = "Java";

        int a1 = 10;
        Integer a2 = 10;

        System.out.println("-------------------------------");
        int b1 = 100;
        Integer b2 = b1; //autoboxing (wrapping primitive into object)
        //Long b3 = b1; //error occurs due to wrong wrapper class is being used

        char ch = 'A';
        Character ch2 = ch; //autoboxing

        double d1 = 5.5;
        Double d2 = d1; //autoboxing

        System.out.println("---------------------");

        Integer n1 = 20;
        int n2 = n1; // Unboxing
        //long n3 = n1;
        //double n4 = n1;

        Character e1 = 'Z';
        char e2 = e1; //Unboxing

        //int e3 = e1; //we can change the data types to these, but the values will change
        //long e4 = e1; //it is recommended to use its own primitive types








    }
}
