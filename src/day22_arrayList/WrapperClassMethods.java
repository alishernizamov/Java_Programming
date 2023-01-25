package day22_arrayList;

import java.nio.charset.CharacterCodingException;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20"; //it is treated as text

        //Integer num1 = Integer.parseInt(str); //unboxing
        int num = Integer.parseInt(str); //

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);
        System.out.println("num = " + num);

        System.out.println("----------------------------");

        String s = "20.5";

        //n order to convert it into a primitive data type we use parse method. We call the method
        //from the Double wrapper class to be able to convert it into a prim type
        double num3 = Double.parseDouble(s);

        //in order to use the number in other data structures, use valueOf() method to convert it into
        //a wrapper class value
        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("----------------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x); //parse method is case sensitive

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("----------------------------");

        char ch = '#';

        //so we assign it to a boolean variable
        //to check if the character is a digit, we use a wrapper class called isDigit() and it is boolean
        boolean isDigit = Character.isDigit(ch);

        //to find out whether it is a letter, we use wrapper class isLetter()
        boolean isLetter = Character.isLetter(ch);

        //to see if the letter is a lower case letter, we use a wrapper class method isLowerCase()
        boolean isLowerCase = Character.isLowerCase(ch);

        //the same is verification of the character if it is an uper case isUpperCase()
        boolean isUpperCase = Character.isUpperCase(ch);

        //to check of the character is a special character isLetterOrDigit(). It returns true if the character
        //neither letter nor digit. Opposite (!) of isLetterOrDigis is special character
        boolean isSpecialChar = ! Character.isLetterOrDigit(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCase = " + isLowerCase);
        System.out.println("isUpperCase = " + isUpperCase);
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("----------------------------");

        //extracting digits and calc the sum of them
        String string = "a1b2c3d4e5";

        int sum = 0;

        //first we need to convert the string into character array by using the toCharArray() method
        //and use the for each loop
        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)){ //use isDigit to see if any character is a digit
                sum += Integer.parseInt(""+each); //use parse method to convert it into a prim type (int)
            }                                 //parse method converts the ASCII number into an actual number
        }

        System.out.println("sum = " + sum);





    }


}
