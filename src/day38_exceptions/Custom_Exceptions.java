package day38_exceptions;

class CustomCheckedException extends Exception{

}

class CustomUncheckedException extends RuntimeException{

}

public class Custom_Exceptions {
    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------");

        throw new CustomUncheckedException();
    }
}
