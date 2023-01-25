package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbccccc"; //
        String result = ""; //a3b4c5
        str.split("");

        for (String each : str.split("") ){

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each ); //each: each character

            if ( ! result.contains(each) ){ //if the string does not contain this char,
                result += each  + frequency; //then add that to 'result'

            }

        }

        System.out.println("result = " + result);

    }
}
