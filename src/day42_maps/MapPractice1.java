package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //task: how many (count) female and male employees are in the map?
        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("M")) {
                countMaleEmployees++;
            } else {
                countFemaleEmployees++;
            }
        }

        System.out.println("Male Employees = " + countMaleEmployees);
        System.out.println("Female Employees = " + countFemaleEmployees);

        System.out.println("----------------------------------------------------------------------------");
        //task: display the names of all female employees
        //     iterating with keys
        /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name); //retrieve values (gender) using keys (names)
            if (gender.equals("F")){
                System.out.println(name);
            }
        }
        */

        //     iterating with entries
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                System.out.println(eachEntry.getKey()); //displays names (key)
            }
        }
        //task: update all the "M" values with "Male" and "F"s with "Female"
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                eachEntry.setValue("Female");
            } else {
                eachEntry.setValue("Male");
            }

            //System.out.println(eachEntry);
        }
        System.out.println(employeeMap);

    }
}
