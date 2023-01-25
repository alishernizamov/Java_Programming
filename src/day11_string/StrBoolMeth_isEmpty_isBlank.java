package day11_string;

public class StrBoolMeth_isEmpty_isBlank {
    public static void main(String[] args) {
        //isEmpty() - returns true/false if the string is empty or not. It checks the length

        String word = "";
        boolean r1 = word.isEmpty();
        System.out.println("r1 = " + r1);

        System.out.println("-----------------------");
        //isBlank() - returns true if string is blank even if contains spaces and no characters

        String str = "            ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("isEmpty = " + r2);
        System.out.println("isBlank = " + r3);






    }
}
