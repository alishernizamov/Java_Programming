package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Methods {
    public static void main(String[] args) {

        System.out.println("--------------------------------PUTALL()----------------------------------");
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashavar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        Map<String, String> employees = new TreeMap<>(); //to keep the sorted order we used TreeMap<>
        employees.putAll(map);

        System.out.println(employees);

        System.out.println(map.equals(employees));






    }
}
