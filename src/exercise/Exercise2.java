package exercise;

import utilities.ArraysUtility;

public class Exercise2 {
    public static void main(String[] args) {

        String[] array = {"Lucy", "Umran", "Sumeye", "Abdullah", "United States OF America"};

        int[] array2 = {10, 20, 50, 505};

        char[] ch = {'a', 'b', 'f', 'h'};

        ArraysUtility.contains(array,"Aslam");

        ArraysUtility.contains(array2,505);

        ArraysUtility.contains(ch, 'a');



    }
}
