package day04_concatination;

public class ConcatenationIntro {
    public static void main(String[] args) {
        //Concatenation must always involve String

        String name = "Alexandra";
        int age = 27;
        int salary = 1_085_000; //you can use _ instead of , to make it more readable

        System.out.println("Hello " + name + ".");
        System.out.println("You are " + age + " years old. And your salary is " + salary + " USD.");

    }
}
