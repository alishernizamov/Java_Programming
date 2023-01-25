package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

        // age of student is 28
        // salary is $10000

        int age = 28; // the name of the variable is meaningful and not some x or y or b, etc.
        int salary = 10000;

        // int age = 32; // variable name must be unique

        //for long names use camel case camelCase
        int phoneNumber = 123456789; // camel case, it is meaningful and readable

        double salaryBeforeTax = 100000.5;

        double salary_after_tax$ = 80000.5;

        System.out.println("-------------------------------------");

        //variable names can contain numbers but cannot begin with numbers
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        // double abstract = 5.5; //variable names cannot be Java reserved words
        // double final = 85.5; // 'final' is a Java reserved word

        System.out.println("-------------------------------------");

        //gender is male
        String gender = "Male";

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);



    }

}
