package utilities;

//import day27_accessModifiers.Data;

import static day27_accessModifiers.Data.d; //you can call the actual object by using the above methodology
import static day27_accessModifiers.Data.method3;
import static day27_accessModifiers.Data.*; //imports all static members (variables and methods), not instances

public class Test2 {
    public static void main(String[] args) {

        //System.out.println(Data.d);
        //w/o importing the class, we can import the

        System.out.println(d);
        method3();
        method4();
        System.out.println(e);
/*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();
*/


    }
}
