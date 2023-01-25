package day07_IF_Statement;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'A';

        String result = null;

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




    }
}
/*
Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */
