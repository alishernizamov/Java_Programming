package day19_array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0]; //assumed that the 1st element is the highest number

        for (int i = 0; i < numbers.length; i++) { //i: 1,2,3,4,5
            if (numbers[i] > max ){ //compares the element with the current max number (which is initially element 1 (index0)
                max = numbers[i]; //current max number will be replaced with the higher number
            }
        }
        System.out.println(max);

    }
}
