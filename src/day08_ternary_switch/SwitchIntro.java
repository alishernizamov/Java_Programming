package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

        char grade = 'Q';

        String result = null;
/*
        if(grade == 'A'){
            result = "Excellent";
        }else if(grade == 'B'){
            result = "Great job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else if(grade == 'F'){
            result = "Failed";
        }else{
            result = "Invalid Entry";
        }
        System.out.println(result);
*/
        System.out.println("------------------------------------------");

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");;
               break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            default:
            System.out.println("Failed");
                break;
        }





    }
}
