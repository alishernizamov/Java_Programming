package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program1 started");

        try{
            System.out.println( 9 / 0); //arithmetic exception
            System.out.println("Try block");

        }catch  (ArithmeticException e){ //catch block must have the exception type that has IS A relation with the exception in the try block

            System.out.println("Catch block");

        }

        System.out.println("Program ended");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Program1 started");

        String str = null;

        try{
            System.out.println(str.toLowerCase());
            System.out.println("Try block");

        }catch(RuntimeException e){ //e: exception
            System.out.println("Catch block");

        }


        System.out.println("Program1 ended");

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Program3 started");

        try{
            Thread.sleep(5000); //program: pause for 3 seconds
            System.out.println("Try block");

        }catch(InterruptedException e){
            System.out.println("Catch block");
        }



        System.out.println("Program3 ended");





    }

}
