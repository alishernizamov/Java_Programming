package day36_polymorphism;

import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;
import day32_finalKeyword.carTask_methodOverriding.Toyota;


public class PolymorphismPractice {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        //Phone phone = new Samsung("Galaxy S19", "Medium",  700,"Pink");

        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };
        System.out.println("------------------------1ST TASK-------------------------------------");
        //print the model, color and price of each phone object in the following format
        //    				model - color - price
        //for (Samsung eachPhone : phones){ //compile error bc not all phones are Samsung
        for (Phone eachPhone : phones) { //'Phone' is larger type
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        System.out.println("------------------------2ND & 3RD TASKS-------------------------------------");
        //2. How many Iphones in the array of phones?
        int countIphone = 0;
        int countSamsung = 0;
        for (Phone eachPhone : phones){

            if (eachPhone instanceof  IPhone){ //if the phone object is 'iPhone'
                countIphone ++;
            }
            if (eachPhone instanceof Samsung){ //if the phone object is 'Samsung'
                countSamsung ++;
            }

        }
        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);

        System.out.println("------------------------4TH TASK-------------------------------------");
        //4. Display the models of Iphones and samsung that has the price of 700 or greater

        for (Phone eachPhone : phones){

            if (eachPhone instanceof IPhone || eachPhone instanceof Samsung){ //if phone is iPhone or Samsung
                if (eachPhone.getPrice() >= 700){
                    System.out.println(eachPhone.getModel());
                }
            }

        }




    }
}
/*
    1. print the model, color and price of each phone object in the following format
    				model - color - price
	2. How many Iphones in the array of phones?
	3. How many Samsungs in the array of phones?
	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */
