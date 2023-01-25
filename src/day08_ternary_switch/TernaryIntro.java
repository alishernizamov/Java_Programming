package day08_ternary_switch;

public class TernaryIntro {
    public static void main(String[] args) {

        int score = 85;
        String result = "";

        if (score>= 60){
            result = "Passed";
        }else{
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("--------------------------TERNARY----------------------");

        String result2 = (score>= 60) ? "Passed" : "Failed";

        System.out.println(result2);
        System.out.println("--------------------------------------------------------");

        int age = 34;
        String r = "";

        r = (age >= 21)? "Eligible" : "Ineligible";

        System.out.println("r " + r);

    }
}
