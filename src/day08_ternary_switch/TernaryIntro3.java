package day08_ternary_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int score = 50;
        String result = "";

        if (score >= 0 && score <= 100){ //if the score is valid
            if (score >= 60){ //if the score >= 60
                result = "Passed";
            }else{ //if the score <60
                result = "Failed";
            }
        }else{ //if score is not valid
            result = "Invalid Score";
        }

        System.out.println("result = " + result);

        String result2 = (score >= 0 && score <= 100)? //precondition
                            (score >= 60)? "Passed" : "Failed"
                        : "Invalid Score"; //if precondition is false

        System.out.println("result2 = " + result2);
        System.out.println("-----------------------------------------------");

        int n = 9;

        String day = (n >= 1 && n <= 7)? //pre condition
                        (n == 1)? "Mon" :(n == 2)? "Tue" :(n == 3)? "Wed" :(n == 4)? "Thu" :(n == 5)? "Fri"
                        :(n == 6)? "Sat" : "Sun"
                     : "Invalid entry"; //if precondition is false
        System.out.println("day = " + day);

    }
}
