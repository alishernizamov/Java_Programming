package day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>(); //
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.50);
        person1.put("hire_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        //System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>(); //
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hire_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-end Developer");
        person3.put("salary", 90000);
        person3.put("hire_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hire_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hire_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);


        //store all the employee maps into one data structure ==> list of map
        List<Map<String, Object>> listOfMap = new ArrayList<>();
        listOfMap.add(person1);
        listOfMap.add(person2);

        listOfMap.addAll(Arrays.asList(person3,person4,person5) );

        System.out.println(listOfMap);

        System.out.println("--------------------------------------------------------------------------");

        //iterate the listOfMap and each entry
        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        //task: employees' names who were hired this year (2022)
        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("hire_date")) {
                    if (((LocalDate) eachEntry.getValue()).getYear() == 2022) {
                        System.out.println(eachMap.get("name"));
                    }
                }
            }
        }

        System.out.println("--------------------------------------------------------------------------");

        //task: replace name Arthur to Vasil
        listOfMap.get(0).replace("name", "Vasyl");

        System.out.println(listOfMap);

        //task: increase salary of the last person to 50K
        listOfMap.get(listOfMap.size()-1).replace("salary", ( (Integer)listOfMap.get(listOfMap.size()-1).get("salary") )+50000 );

        System.out.println("--------------------------------------------------------------------------");

        //task: change age of the 2nd employee from 31 to 28
        listOfMap.get(1).replace("age",  ( (Integer)listOfMap.get(1).get("age") )+4 );

        System.out.println(listOfMap);

        System.out.println("--------------------------------------------------------------------------");

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "black");
        car1.put("price", 45000.50);

        Map<String, Object> car2 = new LinkedHashMap<>();

        Map<String, Object> car3 = new LinkedHashMap<>();

        Map<String, Object> car4 = new LinkedHashMap<>();

        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll( Arrays.asList( car1, car2, car3, car4 ) );







    }
}
