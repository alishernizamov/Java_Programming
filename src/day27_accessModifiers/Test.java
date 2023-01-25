package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);;

        System.out.println("-----------------------------------");

        System.out.println(AccessModifiers.publicData); //is accessible within the same package

        System.out.println(AccessModifiers.protectedData); //is accessible within the same package

        System.out.println(AccessModifiers.defaultData); //default is accessible within the same package

        //System.out.println(AccessModifiers.privateData); //not accessible within the same package. Never can it be accessible outside the package


        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.private;



    }
}
