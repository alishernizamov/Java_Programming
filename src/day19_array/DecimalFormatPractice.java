package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00"); //df is a decimal varialbe

        double n1 = 10.584;

        System.out.println( df.format(n1)  );

    }
}
