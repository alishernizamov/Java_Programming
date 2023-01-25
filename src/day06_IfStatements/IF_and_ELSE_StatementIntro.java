package day06_IfStatements;

public class IF_and_ELSE_StatementIntro {
    public static void main(String[] args) {

        int age = 21;

        if (age >= 21){
            System.out.println("Eligible");
        }

        if (age < 21){
            System.out.println("Not eligible");
        }

        System.out.println("--------------------------------------------");

        if (age >= 21){
            System.out.println("Eligible");
        }else{ //otherwise
            System.out.println("Not eligible");
        }



    }

}
