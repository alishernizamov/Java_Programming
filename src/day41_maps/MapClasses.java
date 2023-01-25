package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        System.out.println("-----------------------------HashMap-----------------------------------------------------");
        Map<String, Integer> hashMap = new HashMap<>(); // random order, accept null key & null values
        hashMap.put("AAron", 95000);
        hashMap.put("Daniel", 101000);
        hashMap.put("Daniel", 85000);
        hashMap.put("Emely", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Daniel", 80000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);

        System.out.println("hashMap: "+hashMap);

        System.out.println();
        System.out.println("--------------------------LinkedHashMap---------------------------------------------------");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // keeps insertion order, accepts null key  & null values
        linkedHashMap.put("AAron", 95000);
        linkedHashMap.put("Daniel", 101000);
        linkedHashMap.put("Daniel", 85000);
        linkedHashMap.put("Emely", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Daniel", 80000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println();
        System.out.println("------------------------------TreeMap-----------------------------------------------------");
        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, does not accept null key, accepts null values
        treeMap.put("AAron", 95000);
        treeMap.put("Daniel", 101000);
        treeMap.put("Daniel", 85000);
        treeMap.put("Emely", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Daniel", 80000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); //value can be null
        //treeMap.put(null, 120000); //key cannot be null
        //treeMap.put(null, 110000); //key cannot be null
        //treeMap.put(null, 100000); //key cannot be null

        System.out.println("treeMap = " + treeMap);

        System.out.println();
        System.out.println("-----------------------------Hashtable----------------------------------------------------");
        Map<String, Integer> hashTable = new Hashtable<>(); // random order, does not accept null key & null values, Synchronized
        hashTable.put("AAron", 95000);
        hashTable.put("Daniel", 101000);
        hashTable.put("Daniel", 85000);
        hashTable.put("Emely", 100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Daniel", 80000);
        //hashTable.put("Chris", null); //value in hashTable cannot be null
        //hashTable.put("Breanna", null); //value in hashTable cannot be null
        //hashTable.put(null, 120000); //key in hashTable cannot be null
        //hashTable.put(null, 110000); //key in hashTable cannot be null


        try {
            hashTable.put("Diana", 100000); //key in hashTable cannot be null
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("hashTable = " + hashTable);


    }
}
/*
pair: name & salary

 */
