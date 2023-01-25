package exercise;

import utilities.ArraysUtility;

import java.sql.SQLOutput;

public class Exercise {
    public static void main(String[] args) {

        String[] array = {"Lucy", "Umran", "Sumeye", "Abdullah", "United States OF America"};

        String searchElement = "Aslam";
        String result = "";
        boolean cont = false;
/*
        for (String each : array) {
            if(each.contains(searchElement)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        */

        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchElement){
                cont = true;
            }
        }

        System.out.println(cont);

    }


}
