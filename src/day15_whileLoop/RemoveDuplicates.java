package day15_whileLoop;

public class    RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAAABBBBCCCCDDDDEEEEFFFF";
        int count = 0;
        String result = "";  //"abc" - expected result

        for (int i = 0; i < str.length(); i++) { //i: represents the index numbers of str
            //System.out.println( str.charAt(i) ); //print all characters
            char each = str.charAt(i); //each character of the string str
            //count ++;
            if (!result.contains("" + each)) { //adding an empty string will convert it to String
                //if the string result does not contain the characters of string str yet
                result += each;
            }
            //if the result is not in the string then we will add it to it to the new string

        }


        System.out.println("result = " + result);

    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

Branching (Jump) statements:
		1. Return
		2. Break
		3. Continue
 */