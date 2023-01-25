package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(19);
        multiplication(10,20);
        combine2words("nana","didi");
        System.out.println(addition(20,30));

        System.out.println("Test Started");
        boolean exit = true;


    }

    public static void eligible(int age){ //this is a void method so no value must be returned

        if (age < 0 || age > 150){

            System.err.println("Invalid age: "+ age  );
            return; //exits the method
            // if the age is invalid, then this gets terminated
        }

        if (age >= 20){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Ineligible to buy alcohol");
        }



    }

    public static int multiplication(int n1, int n2){

        int result = n1 * n2;
        System.out.println(result);

        return result; //returns the value when exiting the method
//        System.out.println("hi");
    }

    public static int addition(int num1, int num2){

        int result = num1 + num2;
        return result;
    }

    public static String combine2words(String w1, String w2){

        String combine = w1 + " "+ w2;
        System.out.println(combine);
        return combine;

    }


}
