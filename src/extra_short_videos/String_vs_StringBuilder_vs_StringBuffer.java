package extra_short_videos;

public class String_vs_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {

        String string = "Wooded";
        string.concat(" Spoon"); //"Wooded"

        System.out.println(string); //it is immutable and cannot be modified

        string = string.concat(" Spoon"); //if we reassign it back to 'string', the string will reference the new string object now

        System.out.println(string); //"Wooden Spoon"

        System.out.println("-------------------------STRINGBUILDER-(mutable)---------------------------");

        StringBuilder stringBuilder = new StringBuilder("Wooden");
        stringBuilder.append(" Spoon");

        //since it is mutable, it will modify the object and concatenate the two strings
        System.out.println(stringBuilder); //Wooden Spoon

        System.out.println("-------------------------STRINGBUFFER-(mutable)---------------------------");
        StringBuffer stringBuffer = new StringBuffer("Wooden");
        stringBuffer.append(" Spoon");

        //since it is mutable, it will modify the object and concatenate the two strings
        System.out.println(stringBuffer); //Wooden Spoon



    }
}
