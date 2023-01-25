package day07_IF_Statement;

public class NestedIF_Intro {
    public static void main(String[] args) {

        int score = 10;

        if (score >= 0 && score <= 100){ //if the score is valid
            if (score >= 60){ //if the score >= 60
                System.out.println("Passed");
            }else{ //if the score <60
                System.out.println("Failed");
            }
        }else{ //if score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------------------------------------------------");

        int age = 32; //1 ~ 150

        if (age >=1 && age <= 150){ //precondition - if it is not met, then execute esle
            if (age >= 21){
                System.out.println("Eligible to buy");
            }else{
                System.out.println("Ineligible to buy");
            }
        }else{
            System.out.println("Invalid Age");
        }

        System.out.println("-------------------------------------------------------------");

        int number = 4;
        String result = "";

        if (number >= 1 && number <= 7){ //precondition
            if (number == 1){
                result = "Mon";
            }else if (number == 2 ){
                result = "Tue";
            }else if (number == 3){
                result = "Wed";
            }else if (number == 4){
                result = "Thu";
            }else if (number == 5){
                result = "Fri";
            }else if (number == 6){
                result = "Sat";
            }else{

            }
            }else{ //if the precondition is failed
            result = "Invalid entry";
        }

        System.out.println(result);

/*
        if (number == 1){
            result = "Mon";
        }else if (number == 2 ){
            result = "Tue";
        }else if (number == 3){
            result = "Wed";
        }else if (number == 4){
            result = "Thu";
        }else if (number == 5){
            result = "Fri";
        }else if (number == 6){
            result = "Sat";
        }else if( number == 7){
            result = "Sun";
        }else{
            result = "Invalid";
        }

        System.out.println(result);
*/


    }
}
