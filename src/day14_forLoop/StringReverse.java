package day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {
        //print a reverse of the string "avaJ"
        String str = "Cydeo School";
        //index       0123

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) { //
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

    }

    public static String reverse(String text){
        String reverse = "";

        for (int i = text.length()-1; i >= 0 ; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }
}
