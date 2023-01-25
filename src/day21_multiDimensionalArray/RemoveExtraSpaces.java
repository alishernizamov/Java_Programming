package day21_multiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        
        String str = "      Hello world       I      love       Java        ";
        str = str.trim();

        System.out.println("str = " + str);

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for(String each  : words  ){
            if (! each.isEmpty()){  //if the element in the 'each' string is not empty
                str += each+" ";    //add to the 'str'
            }
        }

        str = str.trim(); //to remove the trailing space

        System.out.println(str);

    }
}
