package day11_string;

public class Substring {
    public static void main(String[] args) {

        String sentence4 = "I Love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1);

        System.out.println(languageName);
        System.out.println("-------------------------");

        String sentence5 = "Today is Sunday, tomorrow is Monday";
        //index:            0123456...
        String today = sentence5.substring(9, 14 + 1);
        System.out.println(today);
        System.out.println("----------***********************-----------");
        //TASK: PRINT ONLY THE DOMAIN OF EMAIL ADDRESS
        String email = "cydeoschooljavaprogramming@yahoo.com";

        int beginning = email.indexOf('@') + 1; //finding index of '@'
        //int length = email.length();
        int ending = email.lastIndexOf('.');
        String domain = email.substring(beginning, ending);
        System.out.println("beginning: " + beginning + "; ending: " + ending);
        System.out.println(domain);
        System.out.println("----------My_substring_code-----------");

        String sentence6 = "I am happy that I am learning Java Programming at Cydeo School";

        int firstIndex = sentence6.indexOf("C");
        int lastIndex = sentence6.lastIndexOf("l")+1;
        String language = sentence6.substring(firstIndex);
        System.out.println("firstIndex = " + firstIndex);
        System.out.println("lastIndex = " + lastIndex);
        System.out.println("Language = " + language);

        System.out.println("----------My_substring_code2-----------");
        String sentence7 = "Today is Thursday and tomorrow is Friday";


    }
}