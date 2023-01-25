package day23_arrayList;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeya"); // 2
        names.add("Sumeya"); // 3
        names.add("Ali"); // 4
        names.add("Sumeya"); // 5
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");


        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);



    }
}
