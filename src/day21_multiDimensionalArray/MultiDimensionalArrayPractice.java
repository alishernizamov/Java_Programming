package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abdullah"};
        String[] group2 = {"Madiyar", "Khashavar", "Rayhane"};
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"};
        String[] group4 = {"Adelina", "Ali"};

        String[][] groups = {group1, group2, group3, group4};
        //                      0       1       2       3
        //to print each group
        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }

        System.out.println("--------------for-each-loop-solution-------------");

        for (String[] eachGroup : groups) { //outer loop will print the groups
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }


        }

        System.out.println("--------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
            
        }




    }
}
