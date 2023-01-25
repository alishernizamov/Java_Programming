package day16_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {
        //Frequency of each character
        String str = "aaabbccccdddeeeeff";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //each character of str
            int count = 0; //represents the frequency
            for (int i = 0; i < str.length(); i++) { //responsible for comparing ch to each character of str and return frequency of ch
                if (str.charAt(i) == ch) { //compares with the 1st char of the string
                    count++;
                }
            }

            if (count == 2 || !result.contains(""+ch)){
                result += ch;
            }

        }

        System.out.println(result);

    }
}
