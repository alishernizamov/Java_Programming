package day27_accessModifiers;

//compare differences bt Inst
public class StaticBl_InstanceBl_Construction {

    public StaticBl_InstanceBl_Construction() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }


    public static void main(String[] args) {
        System.out.println("Main method");

    }
}
