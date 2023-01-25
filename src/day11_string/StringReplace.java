package day11_string;

public class StringReplace {
    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
        sentence = sentence.replace("Python","Java");

        System.out.println("sentence = " + sentence);

        System.out.println("------------------replace()------------------------------");
        //replace() - replaces ALL
        String word = "java";
        word = word.replace('a', 'e'); // this will replace only one character because u used 'a'
        word = word.replace("a", "e"); // this will replace all characters because u used "a"

        System.out.println(word);

        System.out.println("------------------------------------replace()------------------");
        String sentence2 = "I Love Java. Java is cool";
        sentence2.replace("Java","Python"); //ALL Java words have been replaced

        String sentence3 = sentence2.replaceFirst("Java", "Python");

        System.out.println("sentence2 = " + sentence2);
        System.out.println("sentence3 = " + sentence3);

        System.out.println("-------------------------------------replace certain words------------------");
        String sentence4 = "Java is fun, Java is cool, Java is amazing";
        sentence4 = sentence4.replaceFirst(", Java", ", Python");

        System.out.println(sentence4);






    }
}
