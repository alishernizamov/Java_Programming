package day15_whileLoop;

public class RemoveDups_ContinueApproach {
    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains( ""+str.charAt(i) )){  //it checks if the character is in the new string
                continue;   //skip it
            }

            result += str.charAt(i);

        }
        System.out.println(result);
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
