package day16_NestedLoop;

public class FrequencyOfA_Char {
    public static void main(String[] args) {

        String str = "aaacbbbccc";
        char ch = 'c';
        //we need to count how many times this char has appeared in the string

        int count = 0;

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str
             //if the char of the string is equal to the given char, it means the given char has appeared in the string
            if (str.charAt(i) == ch){
                count++; //increase the count by one. The only time this count increases if the characters match
            }

        }

        System.out.println( count );




    }




}
