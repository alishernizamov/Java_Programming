package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner( Path.of("D:\\Documents\\Java\\Java Learning\\Java_Programming\\src\\day10_string\\Test.txt") );
        /*
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        */

        System.out.println( scan.hasNext());

        scan.close();

    }
}
