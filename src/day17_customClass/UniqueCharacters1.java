package day17_customClass;

public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str = "aabcccd";
        //index       0123456
        String unique = "";

        for(int i = 0; i < str.length(); i++){ //i: index number if str (0 to the last char)
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each) ){
                unique += each;
            }

        }

        System.out.println(unique);


    }
}
