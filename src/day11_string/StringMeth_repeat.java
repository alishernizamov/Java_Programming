package day11_string;

public class StringMeth_repeat {
    public static void main(String[] args) {

        String str = "Python";

        String result = str.repeat(10); //horizontal repeat
        String result2 = (str+"\n").repeat(10);
        System.out.println("result2 = " + result2); // vertical repeat

    }
}
