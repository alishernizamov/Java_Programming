package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 3);

        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2); //false

        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('S',4,3); //upcasting: casting is done implicitly

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        //double total = obj.calcCost(); // 'calcCost()' does not belong to the Object but to the Pizza obj
        //in order to call the calCost() method we need to downcast obj

        double total = ( (Pizza) obj ).calcCost();

        System.out.println(total);

        //double area = ( (Circle)obj ).area(); //downcasting to get the method from the Circle class

        //System.out.println(area); //'ClassCastException' (bug) due to no IS A relation bw Pizza and Circle

    }
}
