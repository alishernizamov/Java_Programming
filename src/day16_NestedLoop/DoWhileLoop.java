package day16_NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition ;) {
            System.out.println("Hello Cydeo --- For Loop");
        }

        while (condition){
            System.out.println("Hello Cydeo --- While Loop");
        }

        do{
            System.out.println("Hello Cydeo --- do While Loop");
        } while (condition);

    }
}
