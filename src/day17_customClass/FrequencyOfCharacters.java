package day17_customClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
            //index   0123456
        String result = "";  //a2b1c3d1
                            // a b c d
                           //  2 1 3 1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //a
            int count = 0; //counter of occurrences of char in the str

            for (int i = 0; i < str.length(); i++) { //-- inner loop --
                if (str.charAt(i) == ch){
                    count ++;
                }
            }

            if (result.contains(""+ch)){
                continue; //skip a duplicate char
            }

            result += ch + "" + count+" "; //added an empty space

        }
        System.out.println("result = " + result);

    }
}
/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the
            remaining characters
 */