package day08_ternary_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number = 10;

        /*
        String result;
        if (number > 0){
            result = "Positive";
        }else if (number < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        */

        String result = (number > 0) ? "Positive" :(number < 0)? "Negative" : "Zero";
        System.out.println(result);

        System.out.println("------------------------------------------------");

        int n = 1;
        /*
        String day = "";
        if (n == 1){
            day = "Mon";
        }else if (n == 2){
            day = "Tue";
        }else if (n == 3){
            day = "Wed";
        }else if (n == 4){
            day = "Thu";
        }else if (n == 5){
            day = "Fri";
        }else if (n == 6){
            day = "Sat";
        }else{
            day = "Sun";
        }
        */

        String day = (n == 1)? "Mon" :(n == 2)? "Tue" :(n == 3)? "Wed" :(n == 4)? "Thu" :(n == 5)? "Fri"
                :(n == 6)? "Sat" : "Sun";

        System.out.println(day);

        System.out.println("--------------------------------------");

        int num = 10; //1~12

        String month = (num == 1)? "Jan" :(num == 2)? "Feb" :(num == 3)? "Mar" :(num == 4)? "Apr" :(num == 5)? "May"
                :(num == 6)? "Jun" :(num == 7)? "Jul" :(num == 8)? "Aug" :(num == 9)? "Sep" :(num == 10)? "Oct"
                :(num == 11)? "Nov" : "Dec";

        System.out.println("month = " + month);





    }
}
