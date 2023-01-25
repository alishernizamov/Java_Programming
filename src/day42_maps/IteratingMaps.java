package day42_maps;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null
        map.put("Daniel", 95000);                         //  key & null values
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        //Iterate the map by the keys
        System.out.println("--------------------------------------------------------------------");
        for (String eachKey : map.keySet()) { //gets us each key from the map
            //to update values: new value = value x 2
            //map.replace(eachKey, map.get(eachKey) * 2); //map.get(eachKey) represents value of each key
            System.out.println(eachKey);
        }

        System.out.println(map); //{Daniel=190000, Emily=200000, Bella=170000,
                                 // Arron=156000, Jimmy=156000, Breanna=196000}
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        //iterating the map by values

        //task: find employees who make less than 100K
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("--------------------------------------------------------------------");
        //iterating the map by entries/pairs
/*
        for( Map.Entry<String, Integer> eachEntry : map.entrySet() ){ //this is all entries
            System.out.println(eachEntry);
        }
*/
        //shortcut: map.entrySet().for + enter
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }



        System.out.println("--------------------------------------------------------------------");
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey(); //to get each key separately: assigned 'eachKey' as a String variable
            Integer eachValue =  eachEntry.getValue(); //to get each value separately: assigned 'eachValue' as an Integer variable

            System.out.println(eachKey+" : "+eachValue);
        }
        System.out.println("--------------------------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey(); //to get each key separately
            Integer eachValue =  eachEntry.getValue();//to get each value separately
            eachEntry.setValue(eachValue+10000);
        }

        System.out.println(map);

    }

}
