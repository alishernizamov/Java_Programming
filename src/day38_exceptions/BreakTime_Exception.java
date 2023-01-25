package day38_exceptions;

public class BreakTime_Exception extends RuntimeException{

    public BreakTime_Exception(){
        super("It's break time");
    }

    public BreakTime_Exception(String message){
        super(message);
    }

}
