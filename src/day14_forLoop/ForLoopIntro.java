package day14_forLoop;

public class ForLoopIntro {
    public static void main(String[] args) {
        //Repeat 10 times
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("----------------------------------------");

    //       start with 1     print 10 times   'i's value keeps adding 1 each time it runs/loops until it reaches 10
        for(int i = 1;         i < 10;               i++ ){ // and then it will stop as condition was set to less than
            System.out.println("Hello World");              // 10, i.e. 9 times it will print
        }

    }
}
