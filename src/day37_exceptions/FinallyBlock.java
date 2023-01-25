package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println(9 / 0);
        }catch(RuntimeException e){
            System.out.println("Runtime exception has been caught");
            e.printStackTrace();
            System.exit(1); //this terminates the program and 'finally' block will not be executed
        }finally{
            System.out.println("Finally block");
        }








    }
}
