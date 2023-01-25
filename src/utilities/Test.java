package utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data; //after importing we are able to use that classes objects

import javax.accessibility.AccessibleAction;

public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();
        System.out.println("-----------------------------------");

        System.out.println(AccessModifiers.publicData); //public is always accessible in different packages
        //System.out.println(AccessModifiers.protectedData); //protected is not always accessible in diff packages

        // System.out.println(AccessModifiers.defaultData); //it is never accessible outside the package

        //System.out.println(AccessModifiers.private); //not accessible outside the package

    }
}
