package day16_NestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";

        //in order to ignore case sensitivity, new assignments will convert the sentence and word to lower case
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while (sentence.contains(word)) { //keeps looping as long as sentence contains the given word "java"
            count++; // as it loops the count increments by 1
            sentence = sentence.replaceFirst(word, "");  //every loop it replaces the given word with empty string

        }
        System.out.println(count);
    }
}
/*
write program that ca return the frequency of word "java" in a sentence

            ex.
                sentence: "java JAVA Java jAva"

            output:
                4
 */
