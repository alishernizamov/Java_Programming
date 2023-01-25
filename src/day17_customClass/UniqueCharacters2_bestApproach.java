package day17_customClass;

public class UniqueCharacters2_bestApproach {
    public static void main(String[] args) {
        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //a
            int frequency = 0; //it is 0 at the beginning we dont know
            for (int i = 0; i < str.length(); i++) { //how many times ch (characters in the str) has appeared in the str
                if (str.charAt(i) == ch) { //if char appeared in the string
                    frequency++; //increase frequency by 1
                }

            }

            if (frequency == 1) { //if frequency ==1 then it is unique
                unique += ch;
            }

        }
        System.out.println(unique);


    }
}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique
 */
