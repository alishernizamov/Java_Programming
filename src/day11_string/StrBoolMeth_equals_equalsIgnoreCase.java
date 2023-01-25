package day11_string;

public class StrBoolMeth_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        //isEquals() - checks the two strings have the same text

        String str1 = "Cydeo"; //located in the string pool
        String str2 = new String("Cydeo");

        System.out.println((str1 == str2));
        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));

        System.out.println("---------equalsIgnore()----------------");
        //equalsIgnore() method ignores the case sensitivity

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println("equals(): "+s1.equals(s2));
        System.out.println("equalsIgnore(): "+s1.equalsIgnoreCase(s2));

    }
}
