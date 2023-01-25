package day07_IF_Statement;

public class IFStatementWithoutCurleyBraces {
    public static void main(String[] args) {

        //IF STATEMENT WITHOUT CURLEY BRACES IS NOT A GOOD PRACTICE

        char grade = 'A';

        String result = null;

        if(grade == 'A') result = "Excellent";
        else if(grade == 'B') result = "Great job";
        else if(grade == 'C') result = "Good";
        else if(grade == 'D') result = "Passed";
        else if(grade == 'F') result = "Failed";
        else result = "Invalid Entry";

        System.out.println(result);

    }
}
