package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        maxNum(30,30);

        maxNum(12.5,45789);

        initials("alisher","nizamov");

        initials("Muhammad","karim");

    }

    public static void maxNum(double num1, double num2){
        //display max num bw two numbers
        if (num1 > num2){
            System.out.println(num1+" is the maximum number");
        }else if (num2 > num1){
            System.out.println(num2+" is the maximum number");
        }else{
            System.out.println("Both numbers are equal");
        }

    }

    public static void initials(String firstName, String lastName ){

        String initial = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0)+".";
        System.out.println("Initials are: " + initial);

        /*
        String f_n_initial = firstName.substring(0,1).toUpperCase();
        String l_n_initial = lastName.substring(0,1).toUpperCase();
        System.out.println(f_n_initial+"."+l_n_initial+".");
        */
    }

}
/*
1. display max num bw two numbers
2. display initials
 */
