package day37_exceptions;

public class ExceptionIntro {
    public static void main(String[] args) {


        String str = "Java";

        //char ch = str.charAt(250); //unchecked exception - did not occur during compile time (writing the code)
        //System.out.println(ch);

        Pizza pizza = null; //null object
        //pizza.calcCost(); //NullPointerException - unchecked exception

        System.out.println(50/0); //arithmetic exception:50 does not divide by 0 - unchecked exception

        System.out.println("---------------------------------------------------------------");

        int score = 100;

        if (score>59){
            System.out.println("Your grade is D");
        }else if ( score >70){
            System.out.println("Your grade is C");
        }

        System.out.println("---------------------------------------------------------------");

        //Thread.sleep(3000); //Checked exception


    }
}
