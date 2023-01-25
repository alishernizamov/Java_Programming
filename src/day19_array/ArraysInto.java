package day19_array;
import java.util.Arrays;
public class ArraysInto {
    public static void main(String[] args) {

        //regular declaration of variables
        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("------------------------------");

        //array variables
        int [] scores = new int[5]; //we have 5 elements here now: index: 0 to 4
        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;
        //scores[5] = 100; //index does not exist -  error index out of bound
        //scores[-1] = 65; //index does not exist

        //scores = new int[10]; //index: 0 to 9

        //scores = new int[50]; //index: 0 to 49

        /*
        //double [] scores1 = new double[5]; //we have 5 elements here now: index: 0 to 4
        //String [] scores2 = new String[5]; //we have 5 elements here now: index: 0 to 4
*/
        //how to print array objects
        System.out.println(  Arrays.toString(scores)  );

        //printing value in index 2
        System.out.println(scores[2]);
        System.out.println("-----------------------------------------");

        //to iterate the array we use loop
        for (int i = 0; i < scores.length; i++) { //i: indexes of 'scores' array
            System.out.println(scores[i]);
        }

        System.out.println("----------------------------");

        //to get the last index number
        System.out.println(scores[scores.length-1]); //length of the array variable minus 1



    }
}
