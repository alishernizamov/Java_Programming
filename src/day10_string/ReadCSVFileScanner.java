package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadCSVFileScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("D:\\Documents\\ALISHER\\EDU\\SDET CYDEO\\JAVA CLASS MATERIALS\\day10"));

        System.out.println(scan.nextLine());
        scan.close();

    }
}
