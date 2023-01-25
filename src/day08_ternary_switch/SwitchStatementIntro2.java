package day08_ternary_switch;

public class SwitchStatementIntro2 {
    public static void main(String[] args) {

        int n = 2;

        String day = "";

        switch (n){

            case 1:
                day = "Mon";
                break;

            case 2:
                day = "Tue";
                break;

            case 3:
                day = "Wed";
                break;

            case 4:
                day = "Thu";
                break;

            case 5:
                day = "Fri";
                break;

            case 6:
                day = "Sat";
                break;

            case 7:
                day = "Sun";
                break;

            default:
                day = "Invalid";


        }

        System.out.println(day);

    }
}
